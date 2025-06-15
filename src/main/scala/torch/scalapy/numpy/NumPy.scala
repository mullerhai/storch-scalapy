package torch.scalapy.numpy

import scala.reflect.ClassTag
import torch.scalapy.py
import torch.scalapy.interpreter.{PyValue}
import torch.scalapy.readwrite.{Reader, Writer}

@py.native
trait NumPy extends py.Object {
  def asarray[T: ClassTag](s: Seq[T])(using writer: Writer[T], reader: Reader[T]): NDArray[T] = {
    as[py.Dynamic].asarray(s).as[NDArray[T]]
  }

  def array[T: ClassTag](s: Seq[Seq[T]])(using writer: Writer[Seq[Seq[T]]], reader: Reader[T]): NDArray[NDArray[T]] = {
    as[py.Dynamic].matrix(s).as[NDArray[NDArray[T]]]
  }

  def matrix[T: ClassTag](s: Seq[T])(using writer: Writer[T], reader: Reader[T]): NDArray[T] = {
    as[py.Dynamic].matrix(s).as[NDArray[T]]
  }

  def resize[T: ClassTag](s: Seq[T], shape: (Int, Int))(using writer: Writer[T], reader: Reader[T]): NDArray[NDArray[T]] = {
    as[py.Dynamic].resize(s, shape).as[NDArray[NDArray[T]]]
  }

  def clip[T](value: NDArray[T], low: NDArray[T], high: NDArray[T])(using writer: Writer[T], reader: Reader[T]): NDArray[T] = {
    as[py.Dynamic].clip(value, low, high).as[NDArray[T]]
  }

  def ones(size: Int): NDArray[Double] = as[py.Dynamic].ones(size).as[NDArray[Double]]

  def zeroes(size: Int): NDArray[Double] = as[py.Dynamic].zeros(size).as[NDArray[Double]]

  def random: NumPyRandom = as[py.Dynamic].random.asInstanceOf[NumPyRandom]

  def float32: NumPyType = as[py.Dynamic].float32.asInstanceOf[NumPyType]

  def linalg: NumPyLinalg = as[py.Dynamic].linalg.asInstanceOf[NumPyLinalg]
//  @py.native
//  def ones(size: Int): NDArray[Double] = as[py.Dynamic].ones(size)  // py.native

//  @py.native
//  def zeroes(size: Int): NDArray[Double] = py.native
//
//  def random: NumPyRandom = py.native
//
//  def float32: NumPyType = py.native
//
//  def linalg: NumPyLinalg = py.native


}
