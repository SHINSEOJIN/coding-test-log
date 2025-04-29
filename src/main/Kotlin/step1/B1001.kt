package step1

fun main(){
    println("뺄셈을 할 숫자를 입력하세요.")

    val input = readLine()!!
    val (a, b) = input.split(Regex("\\s+")).map{it.toInt()}

    println(a - b)
}