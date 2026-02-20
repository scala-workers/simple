name := "simple-codec-circe"

enableZIOTest := true

libraryDependencies ++= libScalax.shapeless.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`circe`.value
libraryDependencies ++= libScalax.`play-json`.value

run / fork := true

scalafmtOnCompile := true
