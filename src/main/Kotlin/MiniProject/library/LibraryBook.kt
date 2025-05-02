package MiniProject.library

class LibraryBook (
    var isbn: String,
    var title: String,
    var author: String,
    var status: BookStatus = BookStatus.AVAILABLE // 기본값 대여가능
    ) {
    init {
        println("책 등록완료: $isbn, $title, $author, 상태: $status")
    }
}