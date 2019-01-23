package OOP

//Kotlin allows you to define a class within
// another class known as nested class.


class Outer {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b)

    //ERROR
   // var a = Outer()
  // println(a.Nested().callMe())
    // The nested classes in Kotlin do not have access to the outer class instance.
//this can be solved using inner keyword

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())




}