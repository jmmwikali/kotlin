fun main() {
    // Creat assignment3.kt file, and by use of for loop, create an array of seven counties and loop through them
    val counties = arrayOf("Nairobi","Mombasa","Kisumu","Nakuru","Kakamega","Eldoret","Machakos")
     
    for (county in counties) {
        println(county)
    }

    println("============================")

    // Create a For loop to print year from 2000 to 2025
    for (year in 2000..2025) {
        println(year)
    }

    println("============================")

    // Create a For loop to print from 100 to 1
    for (number in 100 downTo 1) {
        println(number)
    }

    println("============================")

    // Create a while loop to print from -20 to +20
    var i = -20

    while (i <= 20) {
        println(i)
        i++
    }

    println("============================")

    // Create a while loop to print all EVEN years from 2000 to 2025.
    var year = 2000

    while (year <= 2025) {
        if (year % 2 == 0) {
            println(year)
        }
        year++
    }
}