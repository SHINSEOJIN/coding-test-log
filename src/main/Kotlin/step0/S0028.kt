package step0

fun main() {
    try {
        println("숫자를 입력하세요")
        val num = readLine()!!.toString()
        var sum = 0
        for (i in 0 until num.length) {
            sum += num[i].toString().toInt()
        }
        println("합계: $sum")
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}