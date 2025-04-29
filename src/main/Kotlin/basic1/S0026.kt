package basic1

fun main() {
    println("뒤집을 단어를 입력하세요.")
    try {
        val word = readLine()!!.toString()
        println(word.reversed())
    }catch (e: Exception){
        println("잘못된 입력입니다.")
    }
}
