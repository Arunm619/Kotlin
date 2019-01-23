package OOP

//object declaration feature
//Singleton is an object-oriented pattern
// where a class can have only one instance (object).

object MyTest {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}


open class Personex() {
    fun eat() = println("Eating food.")

    fun talk() = println("Talking with people.")

    open fun pray() = println("Praying god.")
}


fun main(args: Array<String>) {
    val result: Int

    result = MyTest.makeMe12()

    println("b = ${MyTest.b}")
    println("result = $result")



    val atheist = object : Personex() {
        override fun pray() = println("I don't pray. I am an atheist.")
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()
}