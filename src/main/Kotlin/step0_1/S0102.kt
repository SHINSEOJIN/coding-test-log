package step0_1

import kotlin.random.Random

fun main() {

    val winningNumbers = lottoMachine()    // 당첨 번호 리스트
    val userNumbers = inputLotto()         // 사용자 입력 번호 리스트

    compareLotto(winningNumbers, userNumbers) //로또 번호 비교
}

//로또번호 자동생성
fun lottoMachine() : Set<Int> {
    val numbers = mutableListOf<Int>()

    while (numbers.size < 6) {
        val number = Random.nextInt(1, 46)
        if (!numbers.contains(number)) {
            numbers.add(number)
        }
    }
    println("테스트프린트" + numbers.sorted())
    return numbers.toSet()
}


//로또번호 입력받기
fun inputLotto() : Set<Int> {

    while (true) {
        println("숫자 6개를 입력하세요. (1 ~ 45사이)")
        val input = readLine() ?: continue
        val numbers = input.trim()
            .split(Regex("\\s+"))
            .mapNotNull{it.toIntOrNull()}
            .filter{it in 1..45}
            .toSet()

        if(numbers.size == 6){
            return numbers
        }else{
            println("1부터 45까지의 숫자를 정확히 입력해주세요.")
        }
    }
}

//로또번호 비교하고 개수 출력
fun compareLotto(winnig: Set<Int>, user: Set<Int>){
    val match = winnig.intersect(user).size
    println("당첨번호: ${winnig.sorted()}")
    println("입력번호: ${user.sorted()}")
    println("맞은 개수: $match 개")
}