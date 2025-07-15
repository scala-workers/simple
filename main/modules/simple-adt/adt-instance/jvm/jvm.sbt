scalaVersion := scalaV.v213
name         := "simple-adt-instance"

libraryDependencies ++= libScalax.`kind-projector`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value

enableZIOTest := true

crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
