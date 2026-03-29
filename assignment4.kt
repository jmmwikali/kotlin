fun main() {
    // Create a function to convert Celsius to Fahrenheit.
    fun fahrenheit_convertion (celsius: Int) {
        val fahrenheit = ((9 / 5) * celsius) + 32
        println("$celsius degrees celcius in fahrenheits is: $fahrenheit")
    }
    fahrenheit_convertion(54)

    // Develop a function to calculate compound interest.
    fun compound_interest (amount: Int, principle: Int) {
        val CI = amount - principle
        println("The compound interst is $CI")
    }
    compound_interest(50000, 10000)
    
}