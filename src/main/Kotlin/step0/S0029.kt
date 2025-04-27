package step0

fun main() {

    try {
        println("영단어를 입력하세요.")

        val word = readLine()!!
        var count = 0

        for (ch in word) {
            val c = ch.lowercaseChar()
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o')
                count++
        }
        println("모음 개수: $count")
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}