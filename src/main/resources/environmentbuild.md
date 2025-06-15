1. 检查并更新 Conda
   确保你使用的是最新版本的 Conda，在终端中执行以下命令：
```bash
conda update conda
```

2. 创建虚拟环境[建议使用python12]
   执行下面的命令创建名为 scapy 的 Python 3.12 虚拟环境，同时安装 numpy 和 pandas：
   如果你已有 Python 3.12 环境，如果没有任何 报错的话可以直接使用,如果原有的conda python环境 报错，建议先重新安装新的python环境

````bash
conda create -n scapy python=3.12 numpy pandas
````
执行命令后，Conda 会列出要安装的包及其依赖项，输入 y 并回车确认安装。

3. 激活虚拟环境
   安装完成后，激活 scapy 虚拟环境：
```bash
Windows：

bash
conda activate scapy
macOS/Linux：

bash
source activate scapy

```

4. 验证 Python 安装完整性
   激活环境后，进入 Python 交互式环境，尝试导入 encodings 模块，以此验证 Python 安装是否完整：


bash
python
在 Python 交互式环境中输入：
```pycon
import encodings
print("Encodings module imported successfully")

```

若能成功打印信息，说明 encodings 模块可以正常导入。输入 exit() 退出 Python 交互式环境。

5. 配置环境变量（可选）
   为避免潜在的路径问题，可在系统中设置 PYTHONHOME 和 PYTHONPATH 环境变量：
```bash
Windows： 在命令提示符中执行以下命令（需根据实际路径调整）：

bash
set PYTHONHOME=C:\Users\your_username\anaconda3\envs\scapy
set PYTHONPATH=C:\Users\your_username\anaconda3\envs\scapy\Lib
macOS/Linux： 在终端中执行以下命令（需根据实际路径调整）：

bash
export PYTHONHOME=/home/your_username/anaconda3/envs/scapy
export PYTHONPATH=/home/your_username/anaconda3/envs/scapy/lib

```

6. 在 Scala 项目中更新 Python 路径
   在 D:/data/git/storch-scalapy/build.sbt 文件里更新 Python 解释器路径，指向新创建的虚拟环境：
```scala 3

lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe") // 根据实际路径调整
lazy val javaOpts = python.scalapyProperties.get.map {
  case (k, v) => s"""-D$k=$v"""
}.toSeq

javaOptions ++= javaOpts

```


7. 重启 IDE
   若你使用 IDE 进行开发，完成上述步骤后重启 IDE，让新的环境变量生效。

通过以上步骤，应该能创建一个兼容的 Python 3.12 虚拟环境，避免 ModuleNotFoundError: No module named 'encodings' 错误。


## 程序中python 环境变量配置 
### 示例：
javaOpts:
```bash 

-Djna.library.path=C:\Users\hai71\anaconda3\envs\scapy
-Dscalapy.python.library=python312
-Dscalapy.python.programname=C:\Users\hai71\anaconda3\envs\scapy\python.exe

```


### 另外 需要额外配置 PYTHONHOME 和 PYTHONPATH 环境变量：
```bash
Windows:
set PYTHONHOME=C:\Users\hai71\anaconda3\envs\scapy
set PYTHONPATH=C:\Users\hai71\anaconda3\envs\scapy\Lib

macOS/Linux:
export PYTHONHOME=/home/your_username/anaconda3/envs/scapy
export PYTHONPATH=/home/your_username/anaconda3/envs/scapy/lib
```


### 或者在 程序中 配置添加：
```scala 3
System.setProperty("PYTHONHOME", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
System.setProperty("PYTHONPATH", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\Lib")
System.setProperty("scalapy.python.library", "python312")
System.setProperty("scalapy.python.programname", "C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")
System.setProperty("jna.library.path", "C:\\Users\\hai71\\anaconda3\\envs\\scapy")
lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

```


## example ,运行结果
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


