fun main() {
    // Using if statements or when statement, create a program to find if given year is leap or not
   val year = 2024
   
   if ((year % 4 ==0 && year % 100 != 0) || year % 400 == 0 ) {
    println("The year $year is a leap year")
   }
   else {
    println("The year $year is not a leap year")
   }

    // Using if statements check if a given number is ODD or Even

    val number = 2

    if (number % 2 == 0) {
        println("Even number")
    }
    else {
        println("Odd number")
    }

}