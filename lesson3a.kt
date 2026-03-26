fun main() {
    // FOR LOOP - It is used to execute a block of code/statement a number of times until a condition is met

    for (number in 1..10) {
        println("The number is: $number")
    }

    println("============================")

    // Create a for loop that is able to print from 50 to 65

    for (number in 50..65) {
        println("The number is: $number")
    }

    println("============================")

    // Increment the for loop by use of step
    for (x in 20..40 step 2) {
        println(x)
    }
    println("============================")

    // Below we find the odd numbers in the given range
    for (x in 20..40) {
        if (x % 2 != 0) {
            println(x)
        }
    }

    println("============================")
    // By use of a for loop, generate the multiplication table of 5 from 1 to 5
    for (a in 1..5) {
        val product = a * 5
        println("$a * 5 = $product")
    }

    println("============================")
    // Create a program that is able to find the factorial of number 5
    var factorial = 1

    for (b in 1..5) {
        factorial *= b
        
    }
    println(factorial)
}

// Check on the difference between local variables and global variables