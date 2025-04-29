package basic2

fun main() {
    val input = readLine()!!
    val isAllLetter = input.all { it.isLetter() }

    if (isAllLetter) {
        println(input.reversed())
    }else{
        println("잘못된 입력입니다.")
    }
}