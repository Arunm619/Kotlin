package OOP


//abstract keyword is used to declare abstract classes in Kotlin.
// An abstract class cannot be instantiated (you cannot create objects of an abstract class).
// However, you can inherit subclasses from  them can.

//Abstract classes are always open.
// You do not need to explicitly use open keyword to inherit subclasses from them.


abstract  class Person1(name: String) {

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Person1(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}