package edu.knoldus

import java.io.{File, PrintWriter}
import java.nio.file.Paths

import scala.io.{BufferedSource, Source}

/**
  * Created by Neelaksh on 23/7/17.
  */
trait ReadAndWriteFile extends ReadAndWriteSource {



  override def readFromSourceWithName(inputSource: String): (String,String) = {
    var inputStream : BufferedSource = null
    try{
      inputStream = Source.fromFile(inputSource)
      (Paths.get(inputSource).getFileName().toString , inputStream.mkString) //returns the file data as String
    }
    catch {
      case _:Exception => throw new Exception
    }
    finally {
      inputStream.close()
    }
  }

  override def outputToDest(outputDest: String,fileName:String, data: String): Boolean = {
    val destFilePath = Paths.get(outputDest,fileName).toString
    var writer : PrintWriter = null
    try {
      writer = new PrintWriter(new File(destFilePath))
      //val updatedText = updateData(file, updateFunction)
      val updatedText = data
      writer.write(updatedText)
      true
    }
    catch {
      case _: Exception => false
    }
    finally {
      writer.close()
    }
  }
}
