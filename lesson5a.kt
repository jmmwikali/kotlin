class Person {
    // Attributes/characteristics/properties of a person
    var name = "Mercy"
    var age = 24
    var height = 154
    var gender = "female"

    // Behaviours/actions/doables
    fun walk() {
        println("The person can walk")
    }

    fun speak() {
        println("The person can speak...")
    }

    fun eat() {
        println("The person is eating food")
    }

    fun sleep() {
        println("The person is eating")
    }
}

fun main() {
    // Objects are real world things.
    // An object is instanciated/created/obtained/emanated from a class
    // For us to be able to either access the properties/behaviours of a class, we require to have an object

    // Below we create an object
    var myObject = Person()

    // Below we use the dot separator to access either the function or the properties
    myObject.walk()
    
    println("The age of the person is: " + myObject.age)
    println("The gender of the person is: " + myObject.gender)
    println("The height of the person is: " + myObject.height)

    myObject.eat()
    myObject.sleep()
}