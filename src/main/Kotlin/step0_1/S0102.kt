package step0_1

import kotlin.random.Random

fun main() {
    val results = mutableListOf<LottoResult>() //결과 저장 리스트

    val buyCount = askHowManyTimes()
    println("총 $buyCount 번 로또를 구매합니다.") //로또구매멘트 출력

    for (i in 1..buyCount) {
        buyLotto(i, results)
    }
    printSummary(results) //요약결과 출력
}

//로또번호 자동생성
fun lottoMachine(): Pair<Set<Int>, Int> {
    val numbers = mutableListOf<Int>()

    while (numbers.size < 6) {
        var number = Random.nextInt(1, 46)
        if (!numbers.contains(number)) {
            numbers.add(number)
        }
    }

    var bonus: Int
    do {
        bonus = Random.nextInt(1, 46)
    } while (numbers.contains(bonus))

//    println("테스트프린트" + numbers.sorted())
//    println("보너스 번호: $bonus")

    return Pair(numbers.toSet(), bonus)
}


//로또번호 입력받기
fun inputLotto(): Set<Int> {

    while (true) {
        println("숫자 6개를 입력하세요. (1 ~ 45사이)")
        val input = readLine() ?: continue
        val numbers = input.trim()
            .split(Regex("\\s+"))
            .mapNotNull { it.toIntOrNull() }
            .filter { it in 1..45 }
            .toSet()

        if (numbers.size == 6) {
            return numbers
        } else {
            println("1부터 45까지의 숫자를 정확히 입력해주세요.")
        }
    }
}

//로또번호 비교하고 개수 출력
fun compareLotto(winning: Set<Int>, bonus: Int, user: Set<Int>) {
    val match = winning.intersect(user).size
    val bonusMatched = bonus in user

    println("당첨번호: ${winning.sorted()}")
    println("보너스번호: $bonus")
    println("입력번호: ${user.sorted()}")
    println(
        "맞은 개수: $match 개 (보너스 일치: ${if (bonusMatched) "O" else "X"})"
    )

    //맞은개수비교
    val result = when {
        match == 6 -> "1등"
        match == 5 && bonusMatched -> "2등"
        match == 5 -> "3등"
        match == 4 -> "4등"
        match == 3 -> "5등"
        match == 2 -> "6등"
        else -> "낙첨되었습니다."
    }
    println("결과: $result")
}

//로또 구매횟수 입력받기
fun askHowManyTimes(): Int {
    while (true) {
        println("로또를 몇 번 구매하시겠습니까? 숫자로 입력해주세요.")
        var input = readLine()?.toIntOrNull()
        if (input != null && input > 0) {
            return input
        } else {
            println("구매할 횟수를 숫자로만 정확히 입력해주세요")
        }
    }
}

// 로또 한 번 구매할 때마다 결과 저장
fun buyLotto(round: Int, results: MutableList<LottoResult>) {
    println("\n====${round}번째 로또구매 ====")

    val (winningNumbers, bonusNumber) = lottoMachine()
    val userNumbers = inputLotto()

    val match = winningNumbers.intersect(userNumbers).size
    val bonusMatched = bonusNumber in userNumbers

    val rank = when {
        match == 6 -> "1등"
        match == 5 && bonusMatched -> "2등"
        match == 5 -> "3등"
        match == 4 -> "4등"
        match == 3 -> "5등"
        match == 2 -> "6등"
        else -> "낙첨"
    }

    results.add(
        LottoResult(
            round = round,
            winning = winningNumbers,
            bonus = bonusNumber,
            user = userNumbers,
            matchCount = match,
            bonusMatched = bonusMatched,
            rank = rank
        )
    )

    // 화면에 보여주기
    println("결과: $rank (맞춘 개수: $match 개, 보너스 번호 ${if (bonusMatched) "O" else "X"})")
}

// 전체 로또 구매 결과 요약 출력
fun printSummary(results: List<LottoResult>) {
    val summary = mutableMapOf(
        "1등" to 0,
        "2등" to 0,
        "3등" to 0,
        "4등" to 0,
        "5등" to 0,
        "6등" to 0,
        "낙첨" to 0
    )

    for (result in results) {
        summary[result.rank] = summary.getOrDefault(result.rank, 0) + 1
    }

    println("\n전체 로또 구매 결과 요약:")

    val ranks = listOf("1등", "2등", "3등", "4등", "5등", "6등", "낙첨")
    for (rank in ranks) {
        println("$rank: ${summary[rank]}번")
    }
}


data class LottoResult(
    val round: Int,            // 몇 번째 구매?
    val winning: Set<Int>,      // 당첨 번호 6개
    val bonus: Int,             // 보너스 번호
    val user: Set<Int>,         // 사용자가 입력한 번호
    val matchCount: Int,        // 맞춘 번호 개수
    val bonusMatched: Boolean,  // 보너스 번호 맞췄는가?
    val rank: String            // 최종 등수
)