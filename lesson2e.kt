fun main() {
    // WHEN STATEMENT
    // The when statement in Kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block

    val marks = 70

    when (marks) {
        in 1..30 -> println("You Failed")
        in 31..50 -> println("You have an average score")
        in 51..70 -> println("You have a score above average")
        in 70..100-> println("You Passed")
        else -> println("Invalid score!..")
    }
}