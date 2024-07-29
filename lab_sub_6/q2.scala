import scala.io.StdIn.readLine

object StudentRecordApp {

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks should be between 0 and total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student's name:")
    val name = readLine().trim

    println("Enter marks obtained:")
    val marks = readLine().trim.toInt

    println("Enter total possible marks:")
    val totalMarks = readLine().trim.toInt

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

    if (!isValid) {
      println(s"Error: ${errorMessage.getOrElse("Unknown error")}")
      return getStudentInfo()
    }

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    println("Please enter student details:")
    getStudentInfo()
  }

  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
  }
}
