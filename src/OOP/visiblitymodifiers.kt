package OOP


//visiblity Modifiers
//public	declarations are visible everywhere
//private	visible inside the file containing the declaration
//internal	visible inside the same module (a set of Kotlin files compiled together)
//protected	not available for packages (used for subclasses)


fun function1() {}   // public by default and visible everywhere

private fun function2() {}   // visible inside hello.kt

internal fun function3() {}   // visible inside the same module

var name = "Foo"   // visible everywhere


private class class1 {}   // visible inside hello.kt


open class Base() {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    protected fun e() { }     // visible to the Base and the Derived class
}

class Derived: Base() {

    // a, c, d, and e() of the Base class are visible
    // b is not visible

    override val c = 9        // c is protected
}


//Changing Visibility of a Constructor

class Test(val a: Int) {
    // code
}
//now its private
class Test1 private constructor(val a: Int) {
    // code
}



fun main(args: Array<String>) {
    val base = Base()

    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
}
