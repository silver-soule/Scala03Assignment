package edu.knoldus

import java.io.{BufferedReader, File, FileReader, PrintWriter}
import java.nio.file.Paths

import scala.io.BufferedSource
//alternative to os.path.join

import scala.io.Source
/**
  * Created by Neelaksh on 20/7/17.
  */
trait ReadAndWriteFolder extends ReadAndWriteFile {
  /*
  returns a list of paths for the files
   */
  final def readFolder(sourceName:String,filterFlag:String):List[(String,String)] = {
    val d = new File(sourceName)
    if (d.exists && d.isDirectory) {
      val listOfFileNames: List[String] = d.listFiles.filter((x)=>x.isFile && filterCondition(x.getName,filterFlag)).map(_.getAbsolutePath).toList
      listOfFileNames.map((x)=>readFromSourceWithName(x))
    }
    else {
      throw new Exception("Invalid directory")
    }
  }

  final def writeFolder(destFolder:String,fileNamesAndData:List[(String,String)]) : List[Boolean] = {
    val updatedData = fileNamesAndData.map((x)=>(x._1,transformDataFromFile(x._2)))
    updatedData.map((x)=>outputToDest(destFolder,x._1,x._2))
  }

  def filterCondition(fileName:String,inputCondition:String) : Boolean = true

  def transformDataFromFile(inputData:String) : String

}
