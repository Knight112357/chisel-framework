import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class HelloSpec extends AnyFlatSpec with ChiselScalatestTester {
  "Hello" should "pass basic poke/expect tests" in {
    test(new Hello(2)) { c =>
      c.io.in.poke(0.U)
      c.io.out.expect(0.U)

      c.io.in.poke(1.U)
      c.io.out.expect(1.U)

      c.io.in.poke(2.U)
      c.io.out.expect(2.U)

      c.io.in.poke(3.U)
      c.io.out.expect(3.U)
    }
    println("Hello, Chisel!")
  }
}
