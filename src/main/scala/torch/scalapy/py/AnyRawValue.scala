package torch.scalapy.py

import torch.scalapy.interpreter.PyValue

trait AnyRawValue {
  private[scalapy] var __scalapy__rawValue: PyValue = null
}

trait AnyPopulateWith {
  def populateWith(v: PyValue): Any = {
    new Any {
      __scalapy__rawValue = v
    }
  }
}
