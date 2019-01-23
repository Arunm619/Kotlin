package OOP

//Kotlin supports both functional and object-oriented programming.

//Object-oriented Programming -Objects share two properties
//1. State
//2. Behaviour


class Lamp {
    //member data
    private var state: Boolean = false


    //member function
    fun turnOn() {
        state = true
    }


    //member function
    fun turnOff() {
        state = false
    }


    //member function
    fun check() {
        println("The current status of the Lamp is " + if (state) "On" else "Off")
    }

}

fun main(args: Array<String>) {

    //var flag  = true

    var l = Lamp()

    //not accessible as private
    //println(l.state)

    l.turnOn()
    l.check()
    l.turnOff()


    val l2 = Lamp()


}