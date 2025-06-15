package torch.scalapy.numpy

import torch.scalapy.py
import torch.scalapy.interpreter.{PyValue}
import torch.scalapy.readwrite.{Reader, Writer}

@py.native
trait NumPyRandom extends py.Object {
  def randn(size: (Int, Int))(using writer: Writer[Double], reader: Reader[Double]): NDArray[Double] = {
    as[py.Dynamic].randn(size).as[NDArray[Double]]
  }

  def randn(size: (Int, Int)): NDArray[Double] = {
    as[py.Dynamic].randn(size).as[NDArray[Double]]
  }
//  def randn(size: Int): NDArray[Double] = py.native

  def rand(size: Int)(using writer: Writer[Double], reader: Reader[Double]): NDArray[Double] = {
    as[py.Dynamic].rand(size).as[NDArray[Double]]
  }

  def rand(size: Int): NDArray[Double] = {
    as[py.Dynamic].rand(size).as[NDArray[Double]]
  }
}
