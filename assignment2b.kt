fun main() {
    // LOOP STRUCTURES

    // FOR LOOP

    // (..) - Range Operator -> Creates a closed range (includes both ends)
    for (i in 1..5) {
        println(i)
    }

    println("================================")

    // (Until) - Creates a range excluding the end value
    for (i in 1 until 3) {
        println(i)
    }

    println("================================")
    // downTo -Counts down
    for (i in 5 downTo 1) {
        println(i)
    }

    println("================================")
    // step - Controls the increment/decrement size.
    for (i in 1..10 step 2) {
        println(i)
    }

    println("================================")

    // WHILE LOOP -Runs aslong as a condition is true

    var number = 3

    while (number <= 6) {
        println(number)
        number++
    }

    println("=============================")

        // DO-WHILE LOOP - 
        var a = 1

        do {
        println(a)
        a++
        } while (a <= 5)

    println("==============================")


    // ARRAYS - a container that holds a fixed number of values of the same type
    // arrayOf() -> Creates a generic array (can hold any type)
    val nums = arrayOf(1, 2, 3, 4)

    // ARRAY OPERATIONS

    // Printing a value
    println("The first number in the array is: " + nums[0]) // 1

    // Find max/min
    println("The largest number in the array is: " + nums.max()) // 4
    println("The smallest number in the array is: " + nums.min()) // 1

    // Sum
    println("The sum of all the numbers in the array is: " + nums.sum()) // 10

    // Size of the array
    println("The size of the array is: " + nums.size)




}