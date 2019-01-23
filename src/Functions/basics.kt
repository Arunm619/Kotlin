package Functions

import kotlin.math.sqrt

fun main(args: Array<String>) {

    //eg println() , sqrt()

    val a = 9
    println(sqrt(a.toDouble()))



    //sample function

    fun callMe() {
        // function body

        println("Invoking call me function")
    }


    callMe()





    fun addNumbers(n1: Double, n2: Double): Int {
        val sum = n1 + n2
        val sumInteger = sum.toInt()
        return sumInteger
    }

        val number1 = 12.2
        val number2 = 3.4
        val result: Int

        result = addNumbers(number1, number2)
        println("result = $result")





    fun getName(s1:String , s2:String) : String = "$s1 $s2"

    println(getName("John", "Doe"))



   // You can omit the curly braces { } of the function body and specify the body after = symbol if the function returns a single expression (like above example).

     //   It is optional to explicitly declare the return type in such case because the return type can be inferred by the compiler. In the above example, you can replace

   // fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

   // with

   // fun getName(firstName: String, lastName: String) = "$firstName $lastName"

}