class Book (){
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 0
}
fun main(){
    val book = Book()
    book.title = "The Awakening"
    book.author = "L.J.Smith"
    book.yearPublished = 1991

    println("${book.title} by ${book.author} " +
            "(${book.yearPublished})")
}

