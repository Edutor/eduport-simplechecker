package dk.edutor.eduport.simple

import org.junit.Assert.*
import org.junit.Test

class SimpleCheckerTest {

  @Test
  fun testSayHelloKurt() {
    val checker = SimpleChecker()
    assertEquals("Hello Kurt from Simple Checker Port", checker.sayHello("Kurt"))
    }

  }