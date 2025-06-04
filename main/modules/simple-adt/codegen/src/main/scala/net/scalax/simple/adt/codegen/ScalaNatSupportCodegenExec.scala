package net.scalax.simple.adt.codegen

import net.scalax.simple.adt.text.v3.{
  FAppenderCodengen,
  ParameterSingleNatSupportX,
  ParametersCodengen,
  ParametersSimpleCodengen,
  SimpleAppenderX,
  TypeGenCodegen
}

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
      val filePath             = writePath / "ParameterSingleNatSupportX.scala"
      val linerContent: String = ParameterSingleNatSupportX(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "AppenderNatSupportX.scala"
      val linerContent: String = FAppenderCodengen(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "TypeGenX.scala"
      val linerContent: String = TypeGenCodegen(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "SimpleAppenderX.scala"
      val linerContent: String = SimpleAppenderX(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ParametersSimpleSupportX.scala"
      val linerContent: String = ParametersSimpleCodengen(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

  }

}
