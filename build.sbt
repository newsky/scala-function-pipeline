organization := "co.torri"

name := "scalaz-stream-test"

version := "0.6.3"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.1"
)

scalacOptions += "-deprecation"

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)
