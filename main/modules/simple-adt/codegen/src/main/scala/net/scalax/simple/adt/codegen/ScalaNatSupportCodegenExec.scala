package net.scalax.simple.adt.codegen

import java.io.PrintWriter
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.util.Using

object ScalaNatSupportCodegenExec:

  def main(arr: Array[String]): Unit =

    val List(rootString) = arr.to(List)
    val rootPath         = Paths.get(rootString)
    val writePath        = rootPath.resolve(Paths.get("net", "scalax", "simple", "adt", "nat", "support"))
    Files.createDirectories(writePath)

    locally {
      val filePath = writePath.resolve("ParameterNatSupportX.scala")
      Using.resource(new PrintWriter(filePath.toFile, StandardCharsets.UTF_8.name())) { writer =>
        val linerContent: String = ParametersCodengen(index = 6).text
        writer.println(linerContent)
      }
    }

  end main

end ScalaNatSupportCodegenExec
