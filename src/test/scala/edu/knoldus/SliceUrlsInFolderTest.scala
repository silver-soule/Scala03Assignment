package edu.knoldus

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 24/7/17.
  */
class SliceUrlsInFolderTest extends FunSuite {
  test("check valid urls"){
    val filenameAndData  = SliceUrlsInFolder.readFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/InputFiles/UrlFolder","all")
    assert(SliceUrlsInFolder.writeFolder("/home/gitika/IdeaProjects/Scala03-assignments/src/test/Resources/OutputFIles/UrlSplit",filenameAndData).reduce(_&_))
  }
}
