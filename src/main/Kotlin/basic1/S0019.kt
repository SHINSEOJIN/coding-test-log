package basic1

fun main() {
    try {
        println("숫자를 입력하세요.")
        var num = readLine()!!.toInt()
        for (i in 2..num) {
            var isPrime = true
            for (l in 2 until i) {
                if (i % l == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(i)
            }
        }
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}

