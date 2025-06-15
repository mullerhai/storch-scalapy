package torch.scalapy.py

import torch.scalapy.interpreter.CPythonInterpreter

import scala.language.dynamics

trait ModuleApply {
  def apply(module: String): Module = {
    Any.populateWith(CPythonInterpreter.importModule(module)).as[Module]
  }

  def apply(module: String, subname: String): Any = {
    Any.populateWith(CPythonInterpreter.importModule(module))
      .as[Dynamic].selectDynamic(subname)
  }
}