package edu.knoldus

/**
  * Created by Neelaksh on 23/7/17.
  */
object CountWordsInFolder extends ReadAndWriteFolder{

  override def transformDataFromFile(inputData: String): String = {
    val pattern  = "[a-zA-Z]+".r
    //val str = "Hi there , what are you doing today , hi are".toLowerCase()
    val lowercaseData = inputData.toLowerCase
    val x = for{word <- pattern.findAllMatchIn(lowercaseData)} yield word
    val mapOfFrequency = x.toList.groupBy((x)=>x.toString()).mapValues(_.size)
    mapOfFrequency.foldLeft("")((f,s)=>s"$f\n" + s._1 + "=>" + s._2)
  }


  override def filterCondition(fileName: String, inputCondition: String): Boolean = {
    def checkIfTxt(fileName:String) = {
      if(fileName.split('.').length == 2 && fileName.split('.')(1)=="txt") true else false
    }
    inputCondition match{
      case ".txt" => checkIfTxt(fileName)
      case _=> true
    }
  }

}
