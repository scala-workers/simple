name := "simple-adt-nat-support"

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`shapeless`.value

useKindProjector

enableZIOTest := true

scalafmtOnCompile := true
