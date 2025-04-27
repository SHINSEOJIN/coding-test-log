package step0

fun main() {
    println("두 개의 단어를 입력하세요.")
    val input = readLine()!!
    val words = input.split(Regex("\\s+"))
    if(words.size != 2 || words[0].isBlank() || words[1].isBlank()) {
        println("잘못된 입력입니다. 두 개의 단어를 정확하게 입력해 주세요.")
    } else {
        val (first, second) = words
        if (first == second) {
            println("두 개의 단어가 일치합니다.")
        } else {
            println("두 개의 단어가 일치하지 않습니다.")
        }
    }
}
