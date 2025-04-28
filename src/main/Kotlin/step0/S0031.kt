package step0

fun main() {
    println("숫자를 ',' 또는 공백으로 구분하여 입력하세요.")

    try {

        val input = readLine()!!
        val array = input.split(",", " ").map { it.trim().toInt() }

        var sum = 0

        for (i in 0 until array.size) {
            sum += array[i]
        }
        println("총계: $sum")
    } catch (e: NumberFormatException) {
        println("숫자를 입력해주세요.")
    }
}