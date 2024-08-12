object CaesarCipher {

  def encrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isLetter =>
        val base = if (c.isLower) 'a' else 'A'
        ((c - base + shift) % 26 + base).toChar
      case c => c // Non-alphabetic not shifted
    }
  }
  
  def decrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isLetter =>
        val base = if (c.isLower) 'a' else 'A'
        ((c - base - shift + 26) % 26 + base).toChar
      case c => c // Non-alphabetic not shifted
    }
  }

  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
