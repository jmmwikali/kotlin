// 
class Circle {
    // Properties
    var radius = 7
    var pie = 3.142

    // Behaviours
    fun circleArea() {
        val areaofCircle = pie * radius * radius
        println("The area of the circle is: " + areaofCircle)
    }

    fun cicleCircumference() {
        val circumference = 2 * pie * radius
        println("The circumference of the circle is: " + circumference)
    }
}

// Create a class for a rectangle and find the area as well as the perimeter of the rectangle
class Rectangle {
    var length = 20
    var width = 15

    fun rectangleArea() {
        val area = length * width
        println("The area of the rectangle is: " + area)
    }

    fun rectanglePerimeter() {
        val perimeter = 2 * (length + width)
        println("The perimeter of the rectangle is: " + perimeter)
    }
}

fun main() {
    // Below is our object
    var myCircle = Circle()

    myCircle.circleArea()
    myCircle.cicleCircumference()

    println("===============================")

    var myRectangle = Rectangle()

    myRectangle.rectangleArea()
    myRectangle.rectanglePerimeter()
}