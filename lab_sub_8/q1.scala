

object q1 {
    def encryptCaesar(plainText: String, shift: Int): String = {
      plainText.map { char =>
        if (char.isLetter) {
          val shiftAmount = if (char.isUpper) 'A' else 'a'
          ((char + shift - shiftAmount) % 26 + shiftAmount).toChar
        } else {
          char
        }
      }
    }
    def decryptCaesar(cipherText: String, shift: Int): String = {
      encryptCaesar(cipherText, 26 - shift)
    }
    def cipher(func: (String, Int) => String, text: String, shift: Int): String = {
      func(text, shift)
    }

    def main (arg : Array[String]): Unit = {
      val text = "Hello, World!"
      val shift = 3

      val encryptedText = cipher(encryptCaesar, text, shift)
      println(s"Encrypted: $encryptedText")

      val decryptedText = cipher(decryptCaesar, encryptedText, shift)
      println(s"Decrypted: $decryptedText")
    }
}
