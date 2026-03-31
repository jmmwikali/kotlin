// Inheritance is whereby a child class obtains the properties and behaviours of another class (Parent Class).

open class Animal {
    // Properties
    var name = "name"

    // Behaviours of the animal
    fun walk() {
        println("The animal can walk")
    }

    fun sleep() {
        println("The animal can sleep")
    }
}

// Below class inherits from the super/parent class Animal
class Dog : Animal() {
    fun bark() {
        println("The dog likes barking...")
    }
}
 
fun main() {
    // Create an object
    var myDog = Dog()

    // Accessing the behaviours of a dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}