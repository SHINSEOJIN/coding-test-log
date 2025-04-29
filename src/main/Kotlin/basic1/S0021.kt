package basic1

fun main() {
    try {
        var (start, end) = readLine()!!.split(Regex("\\s+")).map { it.toInt() }
        if (start < end) {
            for (num in start..end) {
                if (num % 2 == 0) {
                    println(num)
                }
            }
        }else if (end < start) {
            for (num in end..start) {
                if (num % 2 == 0) {
                    println(num)
                }
            }
        } else {
            println("두 수의 값이 같습니다.")
        }
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}