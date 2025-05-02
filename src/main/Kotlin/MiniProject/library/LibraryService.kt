package MiniProject.library

class LibraryService {

    private val books = mutableListOf<LibraryBook>()

    fun run () {
        registerBook("1001", "노는게 제일좋아", "뽀로로")
        registerBook("1002", "렛잇고", "엘사")

        println("\n 현재 책 목록")
        listBooks()

        updateStatus("1001", BookStatus.BORROWED)

        println("\n 상태 수정 후: ")
        listBooks()
    }

    fun registerBook(isbn: String, title: String, author: String) {
        val book = LibraryBook(isbn, title, author)
        books.add(book)
    }

    fun updateStatus(isbn: String, newStatus: BookStatus) {
        val book = books.find { it.isbn == isbn }
        if(book != null) {
            println("책 상태 변경: ${book.title} - ${book.status} -> $newStatus")
            book.status = newStatus
        }
    }

    fun listBooks() {
        for (book in books) {
            println("ISBN: ${book.isbn}, 제목: ${book.title}, 저자: ${book.author}, 상태: ${book.status}")
        }
    }
}