fun main() {
    // Looping from a higher number to a lower number by use of for loop
    // Create a program that is able to print fro 10  to 1
    for (number in 10 downTo 1) {
        println(number)
    }

    println("===========================")

    // Create a program that finds the odd number from 20 to 10
    for (x in 20 downTo 10) {
        if (x % 2 != 0) {
            println(x)
        }
    }
}