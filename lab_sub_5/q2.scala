import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object Library {
  var books: Set[Book] = Set(
    Book("Book 1", "Author 1", "001"),
    Book("Book 2", "Author 2", "002"),
    Book("Book 3", "Author 3", "003"),
    Book("Book 4", "Author 1", "004")
  )

  def display(): Unit = {
    println("Current Library Collection:")
    books.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def add(): Unit = {
    val title = readLine("Enter the book title: ")
    val author = readLine("Enter the book author: ")
    val isbn = readLine("Enter the book ISBN: ")
    books += Book(title, author, isbn)
    println("Book added successfully!")
  }

  def remove(): Unit = {
    val isbn = readLine("Enter the ISBN of the book to remove: ")
    if (books.exists(_.isbn == isbn)) {
      books = books.filterNot(_.isbn == isbn)
      println("Book removed successfully!")
    } else {
      println("Book not found!")
    }
  }

  def check(): Boolean = {
    val isbn = readLine("Enter the ISBN of the book to check: ")
    books.exists(_.isbn == isbn)
  }

  def search(): Unit = {
    val title = readLine("Enter the book title to search: ")
    val foundBooks = books.filter(_.title.equalsIgnoreCase(title))
    if (foundBooks.nonEmpty) {
      foundBooks.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
    } else {
      println("Book not found!")
    }
  }

  def searchByAuthor(): Unit = {
    val author = readLine("Enter the author name to search: ")
    val foundBooks = books.filter(_.author.equalsIgnoreCase(author))
    if (foundBooks.nonEmpty) {
      foundBooks.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
    } else {
      println("No books found by this author!")
    }
  }

  def main(args: Array[String]): Unit = {
    var continue = true
    while (continue) {
      println("---------------------------------------------")
      println("\nLibrary Management System")
      println("1. Display all books")
      println("2. Add a new book")
      println("3. Remove a book by ISBN")
      println("4. Check if a book is in the library by ISBN")
      println("5. Search for a book by title")
      println("6. Display all books by an author")
      println("7. Exit")
      println("---------------------------------------------")

      val choice = readLine("Enter your choice: ").toInt

      choice match {
        case 1 => display()
        case 2 => add()
        case 3 => remove()
        case 4 => 
          if (check()) println("Book is in the library.") 
          else println("Book not found.")
        case 5 => search()
        case 6 => searchByAuthor()
        case 7 => 
          continue = false
          println("Exiting the Library Management System.")
        case _ => println("Invalid choice! Please try again.")
      }
    }
  }
}
