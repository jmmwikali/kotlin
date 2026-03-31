// PRINCIPLES OF OBJECT ORIENTED PROGRAMMING - Fundamental rules that guide how OOP code is designed, structures and organized
// 1. ENCAPSULATION - Controls access to the data using access modifiers (private, protected, public).
class BankAccount {
    private var balance = 0 // cannot be touched directly
    
    fun deposit(amount: Int) {
        balance += amount
    }
    
    fun getBalance(): Int {
        return balance
    }
}

// INHERITANCE
// DATA ABSTRACTION - Defining a function without fully implementing it
abstract class Animal {
    abstract fun sound()   // no body -> no implementation
}

// Implementation on child classes
class Dog : Animal() {
    override fun sound() {
        println("Woof")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Meow")
    }
}

// POLYMORPHISM - Ability of objects to take multiple forms (same action- different behaviour)
open class Vehicle {
    open fun startEngine() {
        println("Engine starting...")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine roaring!")
    }
}

fun main() {
    // Encapsulation example
    val account = BankAccount()
    account.deposit(1000)
    println("Bank balance: ${account.getBalance()}")  // prints: Bank balance: 1000
    // println(account.balance) //Error message - var balance: Int': it is private in 'BankAccount'

    // Abstraction example
    val dog = Dog()
    val cat = Cat()
    dog.sound()  // prints: Woof
    cat.sound()  // prints: Meow

    // Polymorphism example
    val vehicle = Vehicle()
    val car = Car()
    vehicle.startEngine()  // prints: Engine starting...
    car.startEngine()      // prints: Car engine roaring!
}