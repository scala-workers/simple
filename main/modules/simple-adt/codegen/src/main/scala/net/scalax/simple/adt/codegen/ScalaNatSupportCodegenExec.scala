package net.scalax.simple.adt.codegen

import net.scalax.simple.adt.text.v3.FAppenderCodengen

object ScalaNatSupportCodegenExec {

  def main(arr: Array[String]): Unit = {

    val List(rootString) = arr.to(List)
    val rootPath         = os.Path(rootString)
    val writePath        = rootPath / "net" / "scalax" / "simple" / "adt" / "nat" / "support"

    val parameterSize: Int = 6

    locally {
      val filePath             = writePath / "ParameterNatSupportX.scala"
      val linerContent: String = ParametersCodengen(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "AppenderNatSupportX.scala"
      val linerContent: String = FAppenderCodengen(index = parameterSize * 2).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

  }

}
