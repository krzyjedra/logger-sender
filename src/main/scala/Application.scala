class Logger(prefix: String) {
  def print(message: String) = println(prefix + message)
}

class Sender(header: String) {
  def send(message: String) = header + "\n" + message
  def showOutput(n: Int) = 5
}

object Application extends App {
  val sender = new Sender("header")
  sender.send("task")

  val logger = new Logger("prefix")
  logger.print("auto")

  val jacek = new Logger("[Jacek] ")
  jacek.print("witaj swiecie ")

  val krzysiek = new Logger(">>> ")
  krzysiek.print("tekst ")

  (0 to 2).foreach(a => jacek.print(a.toString))
  (0 to 2).map(_.toString).foreach(a => jacek.print(a))
  (0 to 2).map(_.toString).foreach(jacek.print)

}
