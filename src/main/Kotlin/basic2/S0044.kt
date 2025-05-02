package basic2

class S0044 (val title : String, val author : String, val price : Int){
    fun printBookInfo () {
        println("『$title』 by $author, 가격: $price 원")
    }
}

fun main(){
    val s0044 = S0044 ("노는게 제일 좋아", "뽀로로", 12300)
    s0044.printBookInfo()
}