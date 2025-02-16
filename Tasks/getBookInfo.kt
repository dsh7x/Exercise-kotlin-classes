class Book(val title: String, val author: String,
           val yearPublished: Int) {
    fun getBookInfo(): String {
        return " $title by $author ($yearPublished) "
    }
}

fun main() {
    val book1 = Book(
        "The Awakening",
        "L.J.Smith",
        1991
    )

    println(book1.getBookInfo())
}
