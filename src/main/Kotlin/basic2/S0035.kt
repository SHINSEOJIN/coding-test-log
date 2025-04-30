package basic2

fun main() {
    println("'a-g'까지의 알파벳 중 한 개를 입력해주세요.")
    val input = readLine()!!
//        .split(Regex("[\\s,]+"))
        .replace("\\s+".toRegex(),"")

    val wordMap = mapOf(
        'a' to listOf("apple", "angel", "arrow", "animal", "alarm"), // 5개
        'b' to listOf("banana", "bird", "book", "bridge", "basket", "butterfly", "bubble", "beach"), // 8개
        'c' to listOf("cat", "car", "circle", "cloud", "camera", "cookie", "castle"), // 7개
        'd' to listOf("dog", "door", "dragon", "dream", "desk", "dolphin", "diamond", "donut", "drum"), // 9개
        'e' to listOf("egg", "elephant","engine","earth","eraser","energy","echo","eagle","exit", "envelope"), // 10개
        'f' to listOf("fish", "flower", "forest", "fire", "frog", "flag", "fence"), // 7개
        'g' to listOf("goat", "grape", "garden", "ghost", "gift", "guitar") // 6개
    )

    if (input.length == 1) {
        val key = input[0].lowercase()[0]
        val words = wordMap[key]
        if (words != null) {
            val randomword = words.random()
            println("$key 로 시작하는 랜덤 단어는 $randomword 입니다.")
        } else {
            println("'a-g'까지의 알파벳을 입력해주세요.")
        }
    } else {
        println("알파벳 한 글자만 입력해 주세요.")
    }
}

