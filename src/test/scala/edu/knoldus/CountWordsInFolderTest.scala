package edu.knoldus

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 24/7/17.
  */
class CountWordsInFolderTest extends FunSuite {


  test("testing writeFolder of CountWords") {
    val filenameAndData  = CountWordsInFolder.readFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/InputFiles","all")
    assert(CountWordsInFolder.writeFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/OutputFIles/CountedWordFiles",filenameAndData).reduce(_&_))
  }

  test("testing writeFolder of CountWords exception thrown") {
    intercept[java.lang.Exception] {
      val filenameAndData = CountWordsInFolder.readFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/InvalidDir", "all")
      //assert(CapitaliseFolder.writeFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/OutputFIles/CapitalisedFiles",filenameAndData).reduce(_&_))
    }
  }

}

