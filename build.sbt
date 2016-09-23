
name := "scala-zeromq"

organization := "com.mdialog"

version := "1.2.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:postfixOps")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.10",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.10" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

dependencyOverrides += "org.scala-lang.modules" %% "scala-xml" % "1.0.5"