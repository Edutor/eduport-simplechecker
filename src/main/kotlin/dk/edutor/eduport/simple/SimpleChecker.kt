package dk.edutor.eduport.simple

import dk.edutor.eduport.*

class SimpleChecker : Port {
  override fun check(challenge: Challenge, solution: Solution): Assessment {
    if (!(challenge is StringChallenge)) throw IllegalArgumentException("Challenge should be string")
    if (!(solution is StringSolution)) throw IllegalArgumentException("Solution should be string")

    if (challenge.answer == solution.text) return Assessment(solution, 12)
    else return Assessment(solution, 0)
    }

  override fun sayHello(text: String) = "Hello $text from Simple Checker Port"

  }