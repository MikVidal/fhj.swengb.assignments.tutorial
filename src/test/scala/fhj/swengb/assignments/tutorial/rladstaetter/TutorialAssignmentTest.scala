package fhj.swengb.assignments.tutorial.rladstaetter

import org.junit.Assert._
import org.junit.Test

class TutorialAssignmentTest {

  /**
   * This test shows that your implementation is correct.
   *
   * To pass the first assignment:
   *
   * -> you have to implement a Scala Object named 'HelloWorldAssignment'
   * -> you have to provide a method called "hello"
   * -> you have to return a string with a specific content
   * -> you have to put it up on your github account
   * -> you have to create a pull request containing your github username
   *
   */
  @Test def test(): Unit = {
    assertEquals("Hello world!", TutorialAssignment.hello())
  }

}
