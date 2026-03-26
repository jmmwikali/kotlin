fun main() {
    val marks = 101

    if (marks < 0 || marks > 100) {
        println("invalid input")
    }
    else if (marks > 0 && marks < 30) {
        println("You Failed")
    }
    else if (marks >= 30 && marks <= 50) {
        println("Average")
    }
    else if (marks > 50 && marks <= 70) {
        println("Above Average")
    }
    else {
        println("You Passed")
    }
}