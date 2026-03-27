// FUNCTIONS - Are reusable blocks of code that perform a specific task (they are defined outside main but called inside it.)

// Functions without parameters
fun greet() {
    println("Hello there!😊")
}

// Functions with parameters (parameter must have its data type)
// Parameter - a variable in a function  that recieves a value when the function is called
fun greeting (name: String) {
    println("Hello $name")
}

fun addition (a: Int, b: Int) {
    val sum = a + b
    println("The sum of the two numbers is: $sum")
}

// Default parameters
fun greetUser (name: String = "Guest") {
    println("Hello $name")
}

fun main() {
    greet()
    greeting("Mercy")
    addition(15, 10)
    greetUser()
    greetUser("Jessica")
    
}