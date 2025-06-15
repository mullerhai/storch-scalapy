package torch.scalapy.py

import torch.scalapy.interpreter.{CPythonInterpreter, PyValue}

object PyNone {
  object None extends Any {
    __scalapy__rawValue = CPythonInterpreter.noneValue
  }
}
