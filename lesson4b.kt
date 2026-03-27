fun main() {
    // Below is a function that is able to add two numbers
    fun addition () {
        val n1 = 10
        val n2 = 20
        val sum = n1 + n2
        println("The sum of the two numbers is: $sum")
    }

    addition()

    println("============================")

    // Create a function that is able to multiply three numbers

    fun multiplication() {
        val n1 = 50
        val n2 = 12
        val n3 = 30
        val product = n1 * n2 * n3
        println("The product of the three numbers is: $product")
    }

    multiplication()


    // Given two number, create a function that is able to find the largest and the smallest of the numbers
    fun number () {
        val numbers = arrayOf(10, 5)
        println("The largest number of the two is: " + numbers.max())
        println("The smallest number of the two is: " + numbers.min())
    }

    number()

    // Given 179 minutes, create a function that is able to convert the said minutes into hours and the remainder of the minutes
    fun hours() {
        val minutes = 179
        val hours = minutes / 60
        val remainder = minutes % 60
        println(" $hours hours and $remainder minutes")
    }

    hours()


}