object encrypt {
  def Encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a' // 'base' is set to the ASCII value of 'A' (65) or ASCII value of 'a' (97)
        val shiftedChar = ((char - base + shift) % 26 + base).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

//  def Decrypt(ciphertext: String, shift: Int): String = {
//    Encrypt(ciphertext, shift = 26 - shift) // Subtracting shift from 26 to handle negative shifts
//  }

  def Decrypt(ciphertext: String, shift: Int): String = {
    ciphertext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a' // 'base' is set to the ASCII value of 'A' (65) or ASCII value of 'a' (97)
        val shiftedChar = ((char - base + 26 - shift) % 26 + base).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, Caesar Cipher!"
    val shiftAmount = 10

    val encryptedText = Encrypt(plaintext, shiftAmount)
    println("Encrypted: " + encryptedText)

    val decryptedText = Decrypt(encryptedText, shiftAmount)
    println("Decrypted: " + decryptedText)

  }
}



