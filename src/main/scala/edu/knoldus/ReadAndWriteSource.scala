package edu.knoldus

import java.io.{File, PrintWriter, Reader, Writer}
import java.nio.file.Paths

import scala.io.Source

/**
  * Created by Neelaksh on 21/7/17.
  */
trait ReadAndWriteSource {

  //val file:File

  //def readFromSource(inputSource:String) : String
  def readFromSourceWithName(inputSource:String): (String,String)

  //def updateData(inputData:String):String = inputData

  def outputToDest(outputDest:String,fileName : String,data:String) : Boolean


}
