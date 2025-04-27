package step0

fun main() {
    println("숫자를 입력하세요.")

    val num = readLine()!!.toInt()

    if (num < 1) {
        println("0보다 큰 정수값을 입력하세요.")
    } else {
        for (i in 1..num) {
            if (i % 3 == 0) {
                println("$i 짝!")
            } else if (i % 3 != 0) {
                println("$i")
            }
        }
    }
}