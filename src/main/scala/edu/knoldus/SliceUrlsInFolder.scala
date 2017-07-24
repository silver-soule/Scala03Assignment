package edu.knoldus

/**
  * Created by Neelaksh on 23/7/17.
  */
object SliceUrlsInFolder extends ReadAndWriteFolder{
  override def transformDataFromFile(inputData: String): String = {
    val pattern = """^([a-zA-Z]+)://www.([a-zA-Z]+).([a-zA-Z.]+)/\?([a-zA-Z]+=[a-zA-Z]+)?""".r
    val listOfUrls = inputData.split("\n").toList
    listOfUrls.map((x)=>pattern.unapplySeq(x).getOrElse("not found")).toString

  }

}
