package basic2

fun main () {
    val numbers = arrayOf(88, 24, 34, 56, 19)
    val min = numbers.minOrNull()
    println("가장 작은 수는 $min 입니다.")
}