name := "simple-adt-nat-support"

scalaVersion       := scalaV.v213
crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`shapeless`.value

useKindProjector

enableZIOTest := true

scalafmtOnCompile := true
