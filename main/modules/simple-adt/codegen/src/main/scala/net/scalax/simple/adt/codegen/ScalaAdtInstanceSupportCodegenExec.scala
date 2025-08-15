package net.scalax.simple.adt.codegen

import net.scalax.simple.adt.text.v3.*

import java.net.URI

object ScalaAdtInstanceSupportCodegenExec {

  def main(arr: Array[String]): Unit = {

    val List(rootString) = arr.to(List)
    val rootPath         = os.Path(URI.create(rootString))
    val writePath        = rootPath / "net" / "scalax" / "simple" / "adt" / "instance" / "support"

    val parameterSize: Int = 22

    locally {
      val filePath             = writePath / "ADTMappingX.scala"
      val linerContent: String = ADTMappingX(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTMappingAbsX.scala"
      val linerContent: String = ADTMappingAbsX(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTCoProductX1.scala"
      val linerContent: String = ADTCoProductX1(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTCoProductX2.scala"
      val linerContent: String = ADTCoProductX2(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTCoProductX3.scala"
      val linerContent: String = ADTCoProductX3(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

  }

}
