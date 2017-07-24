package edu.knoldus

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 24/7/17.
  */
class CapitaliseFolderTest extends FunSuite {


  test("testing writeFolder of CapitaliseFolder") {
    val filenameAndData  = CapitaliseFolder.readFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/InputFiles","all")
    assert(CapitaliseFolder.writeFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/OutputFIles/CapitalisedFiles",filenameAndData).reduce(_&_))
  }

  test("testing writeResultTofile of CapitaliseFolder exception thrown") {
    intercept[java.lang.Exception] {
      val filenameAndData  = CapitaliseFolder.readFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/InvalidDir","all")
      //assert(CapitaliseFolder.writeFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/OutputFIles/CapitalisedFiles",filenameAndData).reduce(_&_))
    }

  }

}
