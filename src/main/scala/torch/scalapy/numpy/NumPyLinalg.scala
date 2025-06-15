package torch.scalapy.numpy

import torch.scalapy.py
import torch.scalapy.interpreter.{PyValue}
import torch.scalapy.readwrite.{Reader, Writer}

@py.native 
trait NumPyLinalg extends py.Object {
//  def inv(arr: NDArray[NDArray[Double]]): NDArray[NDArray[Double]] = py.native

  def inv(arr: NDArray[NDArray[Double]])(using writer: Writer[Double], reader: Reader[Double]): NDArray[NDArray[Double]] = {
    as[py.Dynamic].inv(arr).as[NDArray[NDArray[Double]]]
  }

  def inv(arr: NDArray[NDArray[Double]]): NDArray[NDArray[Double]] = {
    as[py.Dynamic].inv(arr).as[NDArray[NDArray[Double]]]
  }
//  NDArray[NDArray[T]] = {
//    as[py.Dynamic].inv(s, shape).as[NDArray[NDArray[T]]]
//  }
}
