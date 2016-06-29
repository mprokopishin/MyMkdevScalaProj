import sbt._

import Process._

import Keys._

lazy val root = (project in file(".")).
  settings (
    name := "MyFirstProject",
	resolvers += "org.apache.spark" at "https://mvnrepository.com/artifact/org.apache.spark/spark-streaming_2.10",
	libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "2.0.0-preview"

  )

