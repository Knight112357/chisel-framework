import chisel3._

class Hello(width: Int) extends Module {
  val io = IO(new Bundle {
    val in  = Input(UInt(width.W))
    val out = Output(UInt(width.W))
  })
  io.out := io.in
}
