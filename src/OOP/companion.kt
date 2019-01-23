package OOP
/*
class Person2 {
    fun callMe() = println("I'm called.")
}

fun main(args: Array<String>) {
    val p1 = Person2()

    // calling callMe() method using object p1
    p1.callMe()
}

*/


class Person2 {
    companion object Test {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    Person2.callMe()
}