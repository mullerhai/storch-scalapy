package torch.scalapy.numpy

import torch.scalapy.py
import torch.scalapy.interpreter.{PyValue}
import torch.scalapy.readwrite.{Reader, Writer}

class NDArray[T](val value: PyValue)(using reader: Reader[T]) extends py.Object with Seq[T] {
  private val origDynamic = this.as[py.Dynamic]

  def tolist: py.Any = origDynamic.tolist()

  def unary_-(): NDArray[T] = (-origDynamic).as[NDArray[T]]

  def +(o: T)(using writer: Writer[T]): NDArray[T] = (origDynamic + o).as[NDArray[T]]
  def +(o: NDArray[T])(using writer: Writer[NDArray[T]]): NDArray[T] = (origDynamic + o).as[NDArray[T]]

  def -(o: T)(using writer: Writer[T]): NDArray[T] = (origDynamic - o).as[NDArray[T]]
  def -(o: NDArray[T])(using writer: Writer[NDArray[T]]): NDArray[T] = (origDynamic - o).as[NDArray[T]]

  def *(o: T)(using writer: Writer[T]): NDArray[T] = (origDynamic * o).as[NDArray[T]]
  def *(o: NDArray[T])(using writer: Writer[NDArray[T]]): NDArray[T] = (origDynamic * o).as[NDArray[T]]

  def /(o: T)(using writer: Writer[T]): NDArray[T] = (origDynamic / o).as[NDArray[T]]
  def /(o: NDArray[T])(using writer: Writer[NDArray[T]]): NDArray[T] = (origDynamic / o).as[NDArray[T]]

  def T(using writer: Writer[T]): NDArray[T] = origDynamic.T.as[NDArray[T]]

  def astype(newType: NumPyType): NDArray[T] = origDynamic.astype(newType).as[NDArray[T]]

  def reshape(shape: Seq[Int]): NDArray[T] = origDynamic.reshape(shape).as[NDArray[T]]

  def shape: Seq[Int] = origDynamic.shape.as[Seq[Int]]

  override def length: Int = as[py.Dynamic].len(this).as[Int] // py.global.len(this).as[Int]

  override def apply(idx: Int): T = origDynamic.arrayAccess(idx).as[T]

  override def iterator: Iterator[T] = (0 until length).toIterator.map(apply)
}

object NDArray {
  // implicit def reader[T
  given reader[T](using reader: Reader[T]): Reader[NDArray[T]] = new Reader[NDArray[T]] {
    override def read(v: PyValue): NDArray[T] = new NDArray[T](v)(using reader)
  }
}
