import scala.io.StdIn._

object q2 {

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student's name:")
    val name = readLine().trim

    println("Enter student's marks:")
    val marks = readInt()

    println("Enter total possible marks:")
    val totalMarks = readInt()

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _            => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = student
    println(s"Student Record:")
    println(s"Name: $name")
    println(s"Marks: $marks/$totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks must be positive and cannot exceed total possible marks"))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')

    while (!validInput) {
      val tempInfo = getStudentInfo()
      val (name, marks, totalMarks, _, _) = tempInfo
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

      if (isValid) {
        validInput = true
        studentInfo = tempInfo
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("")}")
      }
    }

    studentInfo
  }
}
