import ai.kien.python.Python
import munit.FunSuite
import torch.scalapy.numpy.NumPy
import torch.scalapy.py
//import org.scalatest.FunSuite

class NumPyLinalgSuite extends FunSuite {

  test("Can calculate the inverse of a matrix") {
    System.setProperty("PYTHONHOME", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
    System.setProperty("PYTHONPATH", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\Lib")
    System.setProperty("scalapy.python.library", "python312")
    System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")
    System.setProperty("jna.library.path", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
    lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

    py.local {
      val np = py.module("numpy").as[NumPy]
      val mat = np.array[Double](Seq(
        Seq(1, 2),
        Seq(3, 4)
      ))
      println(mat)
//      val inv = np.linalg.inv(mat)

      // TODO(shadaj): lots of weird behavior with NDArrays for both JVM and native
//      assert(np.linalg.inv(mat).tolist.as[Seq[Seq[Double]]].zip(Seq(
//        Seq(-2.0, 1.0),
//        Seq(1.5, -0.5)
//      )).forall { case (ra, rb) =>
//        ra.zip(rb).forall { case (e1, e2) =>
//          math.abs(e1 - e2) < 0.000001
//        }
//      })
    }
  }
}

////import torch.scalapy.py.SeqConverters
//
//import torch.scalapy.mip
//import mip.constants._
//
//case class KnapsackItem(weight: Double, profit: Double)
//
//object Mip extends App {
//  val items = Seq(
//    KnapsackItem(11, 10),
//    KnapsackItem(15, 13),
//    KnapsackItem(20, 18),
//    KnapsackItem(35, 31),
//    KnapsackItem(10, 7),
//    KnapsackItem(33, 15)
//  )
//
//  val maxWeight = 47
//
//  // TODO: model the knapsack problem
//}
