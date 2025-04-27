package step0

fun main() {
    println("문장을 입력하세요.")
    var sentence = readLine()!!.toString()
    if (sentence.isBlank()) {
        println("입력된 값이 없습니다.")
    } else {
        var words = sentence.split(Regex("\\s+"))

        for (word in words) {
            println(word.length)
        }
    }
}