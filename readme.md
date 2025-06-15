# storch-scalapy

`storch-scalapy` is a Scala 3 project that provides seamless interoperability between Scala and Python. Leveraging the power of Scala 3 and Python's rich ecosystem, this project allows you to call Python packages from your Scala code as if you were writing in Python. It serves as a glue layer for Python packages, with plans to support more in the future.

## Prerequisites
- **Scala 3**: Ensure you have Scala 3 installed on your system. You can check the version using `scala -version`.
- **Python 3.12**: We recommend using Python 3.12. You can create a virtual environment with Python 3.12 and install necessary packages using Conda:


```bash
conda create -n scapy python=3.12 numpy pandas
conda activate scapy
````

```scala 3

libraryDependencies += "io.github.mullerhai" % "storch-scalapy_3" % "0.1.2-1.15.1"
```

## java startup opts config python 
### example：
javaOpts:
```bash 

-Djna.library.path=C:\Users\hai71\anaconda3\envs\scapy
-Dscalapy.python.library=python312
-Dscalapy.python.programname=C:\Users\hai71\anaconda3\envs\scapy\python.exe

```


###  need config PYTHONHOME  PYTHONPATH env variable：
```bash
Windows:
set PYTHONHOME=C:\Users\hai71\anaconda3\envs\scapy
set PYTHONPATH=C:\Users\hai71\anaconda3\envs\scapy\Lib

macOS/Linux:
export PYTHONHOME=/home/your_username/anaconda3/envs/scapy
export PYTHONPATH=/home/your_username/anaconda3/envs/scapy/lib
```


### scala code config：
```scala 3
System.setProperty("PYTHONHOME", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
System.setProperty("PYTHONPATH", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\Lib")
System.setProperty("scalapy.python.library", "python312")
System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")
System.setProperty("jna.library.path", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

```

### example scala code

```scala 3

import ai.kien.python.Python
import torch.scalapy.py
import py.PyQuote
import torch.scalapy.py.AnyConverters

@main
def main(): Unit =
  System.setProperty("PYTHONHOME", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
  System.setProperty("PYTHONPATH", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\Lib")
  System.setProperty("scalapy.python.library", "python312")
  System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")
  System.setProperty("jna.library.path", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
  lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

  val mypy = py.module("numpy")
  val result = mypy.zeros(5)
  print(s"hello numpy ${result}")
  (1 to 5).map(println)
  List("jna.library.path", "scalapy.python.library", "scalapy.python.programname").foreach { prop =>
    println(s"prop ${prop}, ${System.getProperty(prop)}")
  }
```

## example console resuilt
```console


javaOpts: -Djna.library.path=C:\Users\hai71\anaconda3\envs\scapy
-Dscalapy.python.library=python312
-Dscalapy.python.programname=C:\Users\hai71\anaconda3\envs\scapy\python.exe
-lpython312 -LC:\Users\hai71\anaconda3\envs\scapy
-lpython312 -LC:\Users\hai71\anaconda3\envs\scapy
-lpython312 -LC:\Users\hai71\anaconda3\envs\scapy
Success(Map(jna.library.path -> C:\Users\hai71\anaconda3\envs\scapy, scalapy.python.library -> python312, scalapy.python.programname -> C:\Users\hai71\anaconda3\envs\scapy\python.exe))
Success(ArraySeq(-lpython312, -LC:\Users\hai71\anaconda3\envs\scapy))
Map(jna.library.path -> C:\Users\hai71\anaconda3\envs\scapy, scalapy.python.library -> python312, scalapy.python.programname -> C:\Users\hai71\anaconda3\envs\scapy\python.exe)
ArraySeq(-lpython312, -LC:\Users\hai71\anaconda3\envs\scapy)
hello numpy [0. 0. 0. 0. 0.]1
2
3
4
5
prop jna.library.path, C:\Users\hai71\anaconda3\envs\scapy
prop scalapy.python.library, python312
prop scalapy.python.programname, C:\Users\hai71\anaconda3\envs\scapy\python.exe
i = 1
i = 2
i = 3
i = 4
i = 5

Process finished with exit code 0

```


## Future Plans
We plan to expand storch-scalapy to support more Python packages and improve the performance of the interoperability layer. Stay tuned for updates!,
original repo: https://github.com/scalapy/scalapy

### Contributing
Contributions are welcome! If you'd like to contribute to torch-scalapy, please fork the repository, create a new branch, make your changes, and submit a pull request.

## License
This project is licensed under the Apache 2.0 License.