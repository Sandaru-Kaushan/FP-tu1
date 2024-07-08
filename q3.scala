object StringFormatter {

  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val formattedNames = names.map {
      case "Benny" => formatNames("Benny")(toUpper)
      case "Niroshan" => formatNames("Niroshan") { name =>
        val part1 = name.substring(0, 2).toUpperCase
        val part2 = name.substring(2).toLowerCase
        part1 + part2
      }
      case "Saman" => formatNames("Saman")(toLower)
      case "Kumara" => formatNames("Kumara") { name =>
        val part1 = name.substring(0, 1).toUpperCase
        val part2 = name.substring(1, 5).toLowerCase
        val part3 = name.substring(5).toUpperCase
        part1 + part2 + part3
      }
    }

    formattedNames.foreach(println)
  }
}
