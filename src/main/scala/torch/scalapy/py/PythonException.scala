package torch.scalapy.py

class PythonException(s: String) extends Exception(s)

class IndexError(val message: String) extends Exception(message)
