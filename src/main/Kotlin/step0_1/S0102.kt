package step0_1

import kotlin.random.Random

fun main() {

    val (winningNumbers, bonusNumber) = lottoMachine()    // 당첨 번호 리스트
    val userNumbers = inputLotto()         // 사용자 입력 번호 리스트

    compareLotto(winningNumbers, bonusNumber, userNumbers) //로또 번호 비교
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
        bonus = Random.nextInt(1,46)
    } while (numbers.contains(bonus))

    println("테스트프린트" + numbers.sorted())
    println("보너스 번호: $bonus")

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
        "맞은 개수: $match 개 (보너스 일치: ${if (bonusMatched) "O" else "X"})")

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