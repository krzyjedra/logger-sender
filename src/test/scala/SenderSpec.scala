import org.scalatest._
import flatspec._
import matchers._

class SenderSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Sender"

  it should "add header to message" in {
    val sender = new Sender("naglowek")
    val actual = sender.send("akcja")
    val expected = "naglowek\nakcja"
    actual shouldBe expected
  }

  it should "show 5" in {
    val sender = new Sender("naglowek")
    sender.showOutput(5) shouldBe 5
  }
}