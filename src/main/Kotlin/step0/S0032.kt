package step0

//사용자의 입력을 받아 팰린드롬"(앞에서 읽어도 뒤에서 읽어도 같은 단어)인지 판별하는 프로그램

fun main (){
    val input = readLine()!!.split(Regex("\\s+"))

    if(input == input.reversed()){
        println("팰린드롬입니다.")
    }else if(input != input.reversed()){
        println("팰린드롬이 아닙니다.")
    }

}
