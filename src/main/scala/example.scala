import ai.kien.python.Python
import torch.scalapy.py
//import me.shadaj.scalapy.py.SeqConverters
import py.PyQuote
import torch.scalapy.py.AnyConverters//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@main
def main(): Unit =
//  val pathpy = "C:\\Users\\hai71\\AppData\\Local\\Microsoft\\WindowsApps\\python3.10.exe"
//  ai.kien.python.Python(pathpy).scalapyProperties.fold(
//    ex => println(s"Error while getting ScalaPy properties: $ex"),
//    props => props.foreach { case (k, v) => System.setProperty(k, v) }
//  )

//  System.setProperty("scalapy.python.library", "python310")
//  System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\AppData\\Local\\Microsoft\\WindowsApps\\python3.10.exe")
//  System.setProperty("jna.library.path", "C:\\Users\\hai71\\AppData\\Local\\Microsoft\\WindowsApps")
//  lazy val python = Python("C:\\Users\\hai71\\AppData\\Local\\Microsoft\\WindowsApps\\python3.10.exe")


  System.setProperty("PYTHONHOME", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
  System.setProperty("PYTHONPATH", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\Lib")
  System.setProperty("scalapy.python.library", "python312")
  System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")
  System.setProperty("jna.library.path", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
  lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

  lazy val javaOpts = python.scalapyProperties.get.map {
    case (k, v) => s"""-D$k=$v"""
  }.toSeq
  lazy val ldflags = python.ldflags.get
  lazy val ldflagsStr = ldflags.mkString(" ")
  lazy val ldflagsStrWin = ldflags.mkString(" ")
  lazy val ldflagsStrNix = ldflags.mkString(" ")


  println(s"javaOpts: ${javaOpts.mkString(" \r\n")}")
  println(ldflagsStr)
  println(ldflagsStrWin)
  println(ldflagsStrNix)
  println(python.scalapyProperties)
  println(python.ldflags)
  println(python.scalapyProperties.get)
  println(python.ldflags.get)
//  println(python.scalapyProperties.get.map {
  val mypy = py.module("numpy")
  val result = mypy.zeros(5)
  print(s"hello numpy ${result}")
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  (1 to 5).map(println)
  List("jna.library.path", "scalapy.python.library", "scalapy.python.programname").foreach { prop =>
    println(s"prop ${prop}, ${System.getProperty(prop)}")
  }
//  val listLengthPython = py.Dynamic.global.len(List(10, 20, 30).toPythonProxy)
//  val valueInScala = listLengthPython.as[Int]
//  println("Length of python list is: " + valueInScala)
//  py.local {
//    val np = py.module("numpy")
//
//    val rng = np.random.default_rng()
//
//    val randoms = rng.standard_normal(10).as[Seq[Double]]
//
//    randoms.foreach(println(_))
//  }
//
//  val numbers = py"[x * 2 for x in ${Iterator.from(3).take(10).toList.toPythonCopy}]"
//    .as[Seq[Int]]
//
//  println(numbers)
  for (i <- 1 to 5) do
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    println(s"i = $i")

//> using python
//> using scala 2.13



