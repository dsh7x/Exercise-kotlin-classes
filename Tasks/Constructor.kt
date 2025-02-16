class Book (val title: String,
            val author: String,
            val yearPublished: Int)

fun main(){
    val book = Book("The Awakening", "L.J.Smith", 1991)

    println("${book.title} by ${book.author} " +
            "(${book.yearPublished})")
}
