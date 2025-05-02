package basic2

fun main() {
    println("찾고싶은 숫자를 입력하세요.")
    val numbers = arrayOf(5, 10, 15, 20, 25)
    val input = readln().toIntOrNull()

    if (input != null) {
        if (input in numbers) {
            println("$input 은 배열에 포함되어 있습니다.")
        } else {
            println("$input 은 배열에 포함되어 있지 않습니다.")
        }
    } else {
        println("올바른 숫자를 입력해 주세요.")
    }
}