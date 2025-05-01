package basic2

fun main (){
    val numbers = arrayOf(80, 90, 50, 40, 100)
    var sum = 0
    for(num in numbers){
        sum += num
    }
    val average = sum.toDouble() / numbers.size
    println("평균은 $average 입니다.")
}