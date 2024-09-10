object q4 {

  def countLetterOccurrences(words: List[String]): Int = {
    val lengths = words.map(word => word.length)

    val totalLetters = lengths.reduce((a, b) => a + b)

    totalLetters
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")

    val totalLetterCount = countLetterOccurrences(words)

    println(s"Total count of letter occurrences: $totalLetterCount")
  }
}