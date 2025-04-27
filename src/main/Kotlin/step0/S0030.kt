package step0

fun main() {
    println("숫자를 입력하세요.")
    try {
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
    } catch (e: NumberFormatException) {
        println("잘못된 입력입니다. 숫자만 입력하세요.")
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }

}