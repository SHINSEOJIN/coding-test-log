package step0

fun main() {
    val input = readLine()!!.split(Regex("\\s+"))
    val letterCheck = input.all { word -> word.all { it.isLetter() } }

    if (letterCheck) {
        val reversed = input.reversed()
        println(reversed.joinToString(" "))
    } else {
        println("잘못된 입력입니다.")
    }
}