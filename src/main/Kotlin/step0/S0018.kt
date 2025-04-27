package step0

//두 개의 숫자값을 입력받아 홀수 출력
//단, 입력받은 값 중 숫자가 작은 값 부터 시작되어야한다.

fun main() {
    var (start, end) = readLine()!!.split(Regex("\\s+")).map{ it.toInt()}

    try {
        if (start < end) {
            for (i in start..end) {
                if (i % 2 == 1) {
                    println(i)
                }
            }
        } else if (end < start) {
            for (i in end..start) {
                if (i % 2 == 1) {
                    println(i)
                }
            }
        } else {
            println("두 수가 같습니다.")
        }
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}
