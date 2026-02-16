name := "simple-codec"

enableZIOTest := true

libraryDependencies ++= libScalax.shapeless.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`play-json`.value
libraryDependencies ++= libScalax.`scala-reflect`.value
libraryDependencies ++= libScalax.`scala-compiler`.value
libraryDependencies ++= {
  if (scalaVersion.value.startsWith("3.")) {
    List("com.softwaremill.magnolia1_3" %% "magnolia" % "1.3.18")
  } else List.empty
}

scalacOptions ++= {
  if (scalaVersion.value.startsWith("3.")) {
    List("-Yretain-trees")
  } else List.empty
}

run / fork := true
