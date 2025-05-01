package basic2

fun main(){
    first()
    second()
    third()
    fourth()
    fifth()
}



//1. 배열 생성 및 출력
fun first(){
       val numbers = arrayOf(1, 2, 3, 4, 5)

       for (num in numbers) {
           println(num)
       }
   }
//2. 배열 총합 구하기
fun second() {
    val allNumbers = arrayOf(10, 20, 30, 40, 50)

    var sum = 0
    for (num in allNumbers) {
        sum += num
    }
    println("총합은 $sum 입니다.")
}
//3. 배열에서 최대값 찾기
fun third () {
    val maxNumber = arrayOf(12, 35, 7, 99, 24)
        val maxNum = maxNumber.maxOrNull()
        println("가장 큰 수는 $maxNum 입니다.")

}
//4. 사용자 입력으로 배열 채우기
fun fourth(){
    println("숫자 5개를 입력해주세요.")
    val input = readLine()!!
        .split("[\\s,]+".toRegex())
        .map { it.toInt()}
        .toTypedArray()

    println("입력된 배열: ")
    for (num in input){
        println(num)
    }
}
//5. 배열 정렬 후 출력하기
fun fifth (){
    val numbers = arrayOf(4, 1, 7, 3, 9)
    val sorted = numbers.sortedArray()

    println("정렬된 배열: ")
    for (num in sorted){
        println(num)
    }
}