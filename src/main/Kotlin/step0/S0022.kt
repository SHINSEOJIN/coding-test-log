package step0

fun main(){
    var count = 0
    println("소문자 'a'의 개수를 셀 단어를 입력하세요.")
    var word = readLine()!!.toString()
    for(ch in word){
        if(ch == 'a'){
            count = count+1
        }
    }
    if(count == 0){
        println("소문자 'a'가 없습니다.")
    }else{
        println("${count}개")
    }
}