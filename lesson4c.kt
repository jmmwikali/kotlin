fun main(args: Array<String>) {
    // Functions with parameters
    // Parameters are inputs that get passed a when invoking a function
    // NOTE: For a parameter to f work, we must their datatypes.

    fun greeting(name: String) {
        println("Hello $name. Hope you had a great day?")
    }
    
    // When the function is invoked, you pass a given name as an argument
    greeting("Mercy")
    greeting("Maxine")

    println("=========================")
    // Below is an example of a function that is able to calculate the BMI of a person
    fun BMI(weight: Double, height: Double) {
        val answer = weight / (height * height)
        println("The BMI of the person is: "+ answer)
    }

    BMI(60.4, 1.5)
    BMI(53.6, 1.0)

    println("===========================")

    // Create a function that accepts parameters and checks whether a given number is odd or even
    fun check(number: Int) {
        if (number % 2 == 0) {
            println("$number is an even number")
        }
        else {
            println("$number is an odd number")
        }
    }

    check(6)
    check(21)

    // Create a function that accepts a parameter that is able to do the conversion of degree celsius into farenheit
    // Create a function that is able to calculate the compound interest of a person
    // Research on inheritance in kotlin (Come up with an example of a program)

    
}