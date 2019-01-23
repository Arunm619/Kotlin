package OOP

interface MyInterface {

    val test: Int   // abstract property
        //val prop: Int = 23 invalid
        //get() = 23 is valid though
    fun foo() : String   // abstract method (returns String)
    fun hello() {   // method with default implementation
        // body (optional)
        println("Hello")
    }
}

class InterfaceImp : MyInterface {

    override val test: Int = 25
    override fun foo() = "Lol"

    // other code
}


interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMe() {
        println("From interface B")
    }
}

// implements two interfaces A and B
class Child: A, B{
    override  fun callMe() {
       super<A>.callMe()
        super<B>.callMe()
    }
}


fun main(args: Array<String>) {
    var i = InterfaceImp()
    println(i.foo())

    val obj = Child()

    obj.callMe()

}