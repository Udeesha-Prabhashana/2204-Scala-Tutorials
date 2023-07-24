object Main {
//  object CaesarCipher {

  // Encryption function for Caesar cipher
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = ((char - base + shift) % 26 + base).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  // Decryption function for Caesar cipher
  def caesarDecrypt(ciphertext: String, shift: Int): String = {
    caesarEncrypt(ciphertext, 26 - shift) // Subtracting shift from 26 to handle negative shifts
  }

  // Cipher function that takes encryption/decryption functions and processes the data
  def caesarCipher(text: String, shift: Int, mode: String): String = {
    if (mode == "encrypt") {
      caesarEncrypt(text, shift)
    } else if (mode == "decrypt") {
      caesarDecrypt(text, shift)
    } else {
      throw new IllegalArgumentException("Invalid mode. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, Caesar Cipher!"
    val shiftAmount = 10

    val encryptedText = caesarCipher(plaintext, shiftAmount, "encrypt")
    println("Encrypted: " + encryptedText)

    val decryptedText = caesarCipher(encryptedText, shiftAmount, "decrypt")
    println("Decrypted: " + decryptedText)
  }
}