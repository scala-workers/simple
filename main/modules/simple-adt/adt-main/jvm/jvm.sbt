name := "simple-adt"

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-append-support`.value

javacOptions ++= Seq("-source 8", "-target 8")

enableZIOTest := true
useKindProjector
