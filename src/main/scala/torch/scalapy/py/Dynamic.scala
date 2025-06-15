package torch.scalapy.py

import scala.language.dynamics

@native class Dynamic extends Any with AnyDynamics

object Dynamic extends DynamicGlobal
