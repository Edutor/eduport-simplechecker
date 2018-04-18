package dk.edutor.eduport.simple

import dk.edutor.eduport.*
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/*
 * See: https://github.com/kotlintest/kotlintest
 */

class AnotherWayToTest : StringSpec({

  "say hello to kurt should give message with Kurt" {
    SimpleChecker().sayHello("Sonja") shouldBe "Hello Sonja from Simple Checker Port"
    }

  "Answering 42 to HHGttG challenge should give grade 12" {
    val challenge = StringChallenge("42", "What is the answer to life, universe and everything")
    val solution = StringSolution("42", PersonIdentifier(1), 1)
    val assessment = SimpleChecker().check(challenge, solution)
    assessment.grade shouldBe 12
    }

  "Answering 7 to HHGttG challenge should give grade 0" {
    val challenge = StringChallenge("42", "What is the answer to life, universe and everything")
    val solution = StringSolution("7", PersonIdentifier(1), 1)
    val assessment = SimpleChecker().check(challenge, solution)
    assessment.grade shouldBe 0
    }

  })
