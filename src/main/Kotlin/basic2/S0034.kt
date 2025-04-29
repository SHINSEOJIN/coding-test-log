package basic2

fun main() {
    val input = readLine()!!
    val cleaned = input.replace("\\s+".toRegex(),"").lowercase()
    val isAllLetter = cleaned.all { it.isLetter() }

    if(isAllLetter){
        if(cleaned == cleaned.reversed()){
            println("팰린드롬입니다.")
        }else{
            println("팰린드롬이 아닙니다.")
        }
    }else{
        println("잘못된 입력입니다.")
    }

}