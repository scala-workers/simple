val `simple-adt-version` = "0.0.2-M22"

scalaVersion := scalaV.v213
name         := "simple"

val `root/file`        = file(".").getCanonicalFile
val `main/file`        = `root/file` / "main"
val `impractical/file` = `root/file` / "impractical"
val `wip/file`         = `root/file` / "wip"

val `modules/file`  = `main/file` / "modules"
val `test/file`     = `main/file` / "test"
val `doc-only/file` = `main/file` / "doc-only"

val `ghdmzsk/file`                             = `modules/file` / "simple-ghdmzsk"
lazy val ghdmzsk: sbtcrossproject.CrossProject = crossProject(JSPlatform, JVMPlatform) in `ghdmzsk/file`
ghdmzsk.jvm / version := `simple-adt-version`
ghdmzsk.js / version  := `simple-adt-version`

val `adt/file` = `modules/file` / "simple-adt"

val `nat-support/file` = `adt/file` / "nat-support"
lazy val `nat-support`: sbtcrossproject.CrossProject =
  crossProject(JSPlatform, JVMPlatform) in `nat-support/file` dependsOn (`test-common` % Test)
`nat-support`.jvm / version := `simple-adt-version`
`nat-support`.js / version := `simple-adt-version`
`nat-support`.jvm / scalaVersion := scalaV.v213
`nat-support`.js / scalaVersion := scalaV.v213
`nat-support`.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
`nat-support`.js / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
`nat-support`.jvm / publishTo := localStaging.value
`nat-support`.js / publishTo := localStaging.value

val `adt-main/file` = `adt/file` / "adt-main"
lazy val `adt-main`: sbtcrossproject.CrossProject =
  crossProject(JSPlatform, JVMPlatform) in `adt-main/file` dependsOn (`nat-support`, `test-common` % Test)
`adt-main`.jvm / version := `simple-adt-version`
`adt-main`.js / version := `simple-adt-version`
`adt-main`.jvm / scalaVersion := scalaV.v213
`adt-main`.js / scalaVersion := scalaV.v213
`adt-main`.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
`adt-main`.js / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
`adt-main`.jvm / publishTo := localStaging.value
`adt-main`.js / publishTo := localStaging.value

val `adt-codegen/file` = `adt/file` / "codegen"
val `adt-codegen`      = project in `adt-codegen/file`
`adt-codegen` / scalaVersion := scalaV.v3

val `list/file` = `wip/file` / "simple-list"
lazy val list   = crossProject(JSPlatform, JVMPlatform) in `list/file` dependsOn (ghdmzsk, `test-common` % Test) aggregate ghdmzsk

val `wire/file` = `doc-only/file` / "simple-wire"

val `wire-web-app/file` = `wire/file` / "web-app"
lazy val `wire-web-app` = project in `wire-web-app/file`

val `codec/file` = `wip/file` / "simple-codec"
lazy val codec =
  crossProject(JSPlatform, JVMPlatform) in `codec/file` dependsOn (ghdmzsk, `nat-support`, `test-common` % Test) aggregate ghdmzsk
codec.jvm / scalaVersion := scalaV.v213
codec.js / scalaVersion := scalaV.v213
codec.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
codec.js / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

val `codec-codegen/file` = `codec/file` / "codegen"
val `codec-codegen`      = project in `codec-codegen/file`
`codec-codegen` / scalaVersion := scalaV.v3

val `codec-slick/file` = `codec/file` / "simple-codec-slick"
lazy val `codec-slick` = project in `codec-slick/file` dependsOn (codec.jvm, `test-common`.jvm % Test) aggregate codec.jvm
`codec-slick` / scalaVersion       := scalaV.v213
`codec-slick` / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

val `codec-circe/file` = `codec/file` / "simple-codec-circe"
lazy val `codec-circe` = crossProject(JSPlatform, JVMPlatform) in `codec-circe/file` dependsOn (codec, `test-common` % Test) aggregate codec
`codec-circe`.jvm / scalaVersion       := scalaV.v213
`codec-circe`.js / scalaVersion        := scalaV.v213
`codec-circe`.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
`codec-circe`.js / crossScalaVersions  := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

val `nat/file` = `impractical/file` / "simple-nat"
lazy val nat   = crossProject(JSPlatform, JVMPlatform) in `nat/file`
nat.jvm / scalaVersion       := scalaV.v213
nat.js / scalaVersion        := scalaV.v213
nat.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
nat.js / crossScalaVersions  := Seq(scalaV.v212, scalaV.v213, scalaV.v3)

val `test-common/file`                               = `test/file` / "test-common"
lazy val `test-common`: sbtcrossproject.CrossProject = crossProject(JSPlatform, JVMPlatform) in `test-common/file`

`adt-codegen` / rootCodegenPath   := (`adt-main`.jvm / baseDirectory).value / ".." / ".." / "shared" / "src" / "codegen"
`codec-codegen` / rootCodegenPath := (codec.jvm / baseDirectory).value / ".." / "shared" / "src" / "codegen"

addCommandAlias("adtCodegen", s"; ++${scalaV.v3}; adt-codegen/codegenImpl;")
addCommandAlias("cleanSimpleAdt", "; clean; nat-supportJVM/clean; nat-supportJS/clean; adt-mainJVM/clean; adt-mainJS/clean;")
addCommandAlias("releaseSimpleAdt", "; +adt-mainJVM/test; +adt-mainJS/test; +adt-mainJVM/publishSigned; +adt-mainJS/publishSigned;")
addCommandAlias("releaseSimpleAdt1", "; +adt-mainJVM/publishSigned; +adt-mainJS/publishSigned; +nat-supportJVM/publishSigned; +nat-supportJS/publishSigned; sonaBundle;")
addCommandAlias("releaseCodecLocal", "; +codecJVM/publishLocal ; +codecJS/publishLocal ;")

Global / onChangedBuildSource := ReloadOnSourceChanges
