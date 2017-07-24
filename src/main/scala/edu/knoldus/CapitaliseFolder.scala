package edu.knoldus

/**
  * Created by Neelaksh on 23/7/17.
  */
object CapitaliseFolder extends ReadAndWriteFolder {

  override def transformDataFromFile(inputData: String): String = {
    inputData.toUpperCase
  }

  override def filterCondition(fileName: String, inputCondition: String): Boolean = {
    def checkIfTxt(fileName:String) = {
      if(fileName.split('.').length ==2 && fileName.split('.')(1)=="txt") true else false
    }
    inputCondition match{
      case ".txt" => checkIfTxt(fileName)
      case _=> true
    }
  }

}
