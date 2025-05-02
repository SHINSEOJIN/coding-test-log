package basic2

class S0045 (val title : String, val director : String, val year : Int, val rating : Double){
    fun printSummary (){
        println("[$year] 『$title』 by $director - 평점: $rating ")
    }
}

fun main(){
    val movie = S0045("이터널 션샤인", "미셸 공드리", 2004, 8.3)
    movie.printSummary()
}