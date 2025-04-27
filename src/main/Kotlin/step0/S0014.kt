package step0

//사용자로부터 숫자 하나를 입력받아서,
//1부터 그 숫자까지 홀수만 출력

fun main (){
    println("숫자를 입력하세요")
    var number = readLine()!!.toInt()

    for(i in 1..number){
        if(i % 2 == 1){
            println(i)
        }
    }
}