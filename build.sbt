
ThisBuild / version := "0.1.3-1.15.1"

ThisBuild / scalaVersion := "3.6.4"
lazy val root = (project in file("."))
  .settings(
    name := "storch-scalapy",
    javaCppVersion := (ThisBuild / javaCppVersion).value,
  )


fork := true
outputStrategy := Some(StdoutOutput)
connectInput := true
//
//import scala.sys.process._
//lazy val pythonLdFlags = {
//  val withoutEmbed = "python3-config --ldflags".!!
//  if (withoutEmbed.contains("-lpython")) {
//    withoutEmbed.split(' ').map(_.trim).filter(_.nonEmpty).toSeq
//  } else {
//    val withEmbed = "python3-config --ldflags --embed".!!
//    withEmbed.split(' ').map(_.trim).filter(_.nonEmpty).toSeq
//  }
//}
//
//lazy val pythonLibsDir = {
//  pythonLdFlags.find(_.startsWith("-L")).get.drop("-L".length)
//}
//
//javaOptions += s"-Djna.library.path=$pythonLibsDir"

import ai.kien.python.Python
//lazy val python = Python("<optional-path-to-a-python-interpreter-executable>")

//lazy val python = Python("C:\\Users\\hai71\\AppData\\Local\\Microsoft\\WindowsApps\\python3.10.exe")
lazy val python = Python("C:\\Users\\hai71\\anaconda3\\envs\\scapy\\python.exe")

lazy val javaOpts = python.scalapyProperties.get.map {
  case (k, v) => s"""-D$k=$v"""
}.toSeq

javaOptions ++= javaOpts
// https://mvnrepository.com/artifact/dev.scalapy/scalapy-core
//libraryDependencies += "dev.scalapy" %% "scalapy-core" % "0.5.3+14-95e6ab08"
libraryDependencies += "ai.kien" %% "python-native-libs" % "0.2.4"
import sbt.*
import Keys.*
import sbt.Def.settings

import scala.collection.immutable.Seq

ThisBuild / tlBaseVersion := "0.1.3-1.15.1" // your current series x.y
//ThisBuild / CoursierCache := file("D:\\coursier")
ThisBuild / organization := "io.github.mullerhai" //"dev.storch"
ThisBuild / organizationName := "storch.dev"
ThisBuild / startYear := Some(2024)
ThisBuild / licenses := Seq(License.Apache2)
ThisBuild / developers := List(
  // your GitHub handle and name
  tlGitHubDev("mullerhai", "mullerhai")
)

ThisBuild / tlSonatypeUseLegacyHost := false

import xerial.sbt.Sonatype.sonatypeCentralHost
ThisBuild / sonatypeCredentialHost := sonatypeCentralHost

import ReleaseTransformations._
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  releaseStepCommandAndRemaining("sonatypeBundleRelease"),
  setNextVersion,
  commitNextVersion,
  pushChanges,
)


ThisBuild / tlSitePublishBranch := Some("main")

ThisBuild / apiURL := Some(new URL("https://storch.dev/api/"))
val scrImageVersion = "4.3.0" //4.0.34
val pytorchVersion =  "2.5.1"// "2.1.2" 2.5.1-1.5.11"
val cudaVersion = "12.6-9.5"  //"12.4.99" // "12.3-8.9"
val openblasVersion = "0.3.28"// "0.3.26"
val mklVersion = "2025.0"//"2024.0"
ThisBuild / scalaVersion := "3.6.4"
ThisBuild / javaCppVersion := "1.5.11"//"1.5.10"
ThisBuild / resolvers ++= Resolver.sonatypeOssRepos("snapshots")

ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("11"))
ThisBuild / githubWorkflowOSes := Seq("macos-latest", "ubuntu-latest", "windows-latest")

//val enableGPU = settingKey[Boolean]("enable or disqable GPU support") 15100311028
//val hasMKL = {
//  val firstPlatform = org.bytedeco.sbt.javacpp.Platform.current.head
//  firstPlatform == "linux-x86_64" || firstPlatform == "windows-x86_64"
//}

// https://mvnrepository.com/artifact/com.storm-enroute/scalameter
libraryDependencies += ("com.storm-enroute" %% "scalameter" % "0.21" % Test exclude("org.scala-lang.modules","scala-xml_2.13") )cross CrossVersion.for3Use2_13
//libraryDependencies +=   "io.github.mullerhai" % "storch_core_3" % "0.3.6-1.15.1"
// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-alpha.1" % Test
//libraryDependencies +=   "io.github.mullerhai" % "core_3" % "0.3.5-1.15.1"
//libraryDependencies +=   "dev.storch" % "vision_3" % "0.2.3-1.15.1"
libraryDependencies += "org.scalameta" %% "scalameta" % "4.13.6"
libraryDependencies += "net.java.dev.jna" % "jna" % "5.17.0"
//libraryDependencies += "com.lihaoyi" %% "fansi" % "0.5.0"
libraryDependencies +=  "org.scalameta" %% "munit" % "0.7.29" //% Test
libraryDependencies +=  "org.scalameta" %% "munit-scalacheck" % "0.7.29" // % Test
excludeDependencies += ExclusionRule(organization = "org.scala-lang.modules", name = "scala-collection-compat_2.13")
//excludeDependencies += ExclusionRule(organization = "dev.scalapy", name = "scalapy-core")
//excludeDependencies += ExclusionRule(organization = "dev.scalapy", name = "scalapy-core_3")
excludeDependencies += ExclusionRule(organization = "com.lihaoyi", name = "sourcecode_2.13")
// https://mvnrepository.com/artifact/com.lihaoyi/sourcecode
libraryDependencies += "com.lihaoyi" %% "sourcecode" % "0.4.3-M5"
//libraryDependencies += "com.sun.jna" % "jna" % "3.0.9"
ThisBuild  / assemblyMergeStrategy := {
  case v if v.contains("module-info.class")   => MergeStrategy.discard
  case v if v.contains("UnusedStub")          => MergeStrategy.first
  case v if v.contains("aopalliance")         => MergeStrategy.first
  case v if v.contains("inject")              => MergeStrategy.first
  case v if v.contains("jline")               => MergeStrategy.discard
  case v if v.contains("scala-asm")           => MergeStrategy.discard
  case v if v.contains("asm")                 => MergeStrategy.discard
  case v if v.contains("scala-compiler")      => MergeStrategy.deduplicate
  case v if v.contains("reflect-config.json") => MergeStrategy.discard
  case v if v.contains("jni-config.json")     => MergeStrategy.discard
  case v if v.contains("git.properties")      => MergeStrategy.discard
  case v if v.contains("reflect.properties")      => MergeStrategy.discard
  case v if v.contains("compiler.properties")      => MergeStrategy.discard
  case v if v.contains("scala-collection-compat.properties")      => MergeStrategy.discard
  case x =>
    val oldStrategy = (assembly / assemblyMergeStrategy).value
    oldStrategy(x)
}