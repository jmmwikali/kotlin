fun main() {
    val points = 10000
     
    if (points < 0) {
        println("Invalid input")
    }
    else if(points in 0..100) {
        print("You do not qualify")
    }
    else if (points in 101..400) {
        println("You win a Smartphone")
    }
    else if (points in 401 until 1000) {
        println("You win a laptop")
    }
    else {
        println("You win a trip to Canada")
    }
     
}