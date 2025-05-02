package basic2

//정수 배열이 주어졌을 때,
//**짝수의 합**과 **홀수의 개수**를 각각 구해서 출력하시오.

fun main() {
    val numbers = arrayOf(3, 8, 5, 12, 9, 10, 1)
    var sum = 0
    var cnt = 0
    for (num in numbers) {
        if (num % 2 == 0) {
            sum += num
        } else if (num % 2 == 1) {
            cnt++
        }
    }
    println("짝수의 합은 $sum 입니다.")
    println("홀수의 개수는 $cnt 입니다.")
}