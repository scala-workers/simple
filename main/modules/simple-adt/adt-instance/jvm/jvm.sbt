name := "simple-adt"

scalaVersion       := scalaV.v213
crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

libraryDependencies ++= libScalax.`scala-collection-compat`.value

enableZIOTest := true
useKindProjector
