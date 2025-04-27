package step0

fun main() {
    try {
        println("시작하는 문자를 입력하세요: ")
        var found = false
        val ch = readLine()!!.first() //첫 문자만 가져오기
        //a-z, A-Z까지 단어 문자열로 생성
        val words = listOf(
            "apple",
            "banana",
            "cat",
            "dog",
            "elephant",
            "frog",
            "grape",
            "hat",
            "ice",
            "jungle",
            "kite",
            "lion",
            "monkey",
            "nest",
            "orange",
            "piano",
            "queen",
            "rabbit",
            "sun",
            "tiger",
            "umbrella",
            "violin",
            "wolf",
            "xylophone",
            "yacht",
            "zebra",
            "Ant",
            "Bear",
            "Carrot",
            "Dragon",
            "Eagle",
            "Fox",
            "Goat",
            "Horse",
            "Island",
            "Jellyfish",
            "King",
            "Lemon",
            "Mountain",
            "Notebook",
            "Octopus",
            "Penguin",
            "Quiz",
            "Rocket",
            "Snake",
            "Train",
            "Unicorn",
            "Violet",
            "Whale",
            "Xerus",
            "Yellow",
            "Zookeeper"
        )

        for (word in words) {
            if (word.startsWith(ch)) {
                println(word)
                found = true
            }
        }
        if (!found) {
            println("잘못된 입력입니다.")
        }
    } catch (e: Exception) {
        println("잘못된 입력입니다.")
    }
}