package step1

fun main(){
    val input = readLine()!!
    val (a, b) =input.split(Regex("\\s+")).map{it.toInt()}
    println("a + b")
}