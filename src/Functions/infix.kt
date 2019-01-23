package Functions

fun main(args: Array<String>) {


    var a = true
    var b = false

    println( a or b  )  // a.or(b)
    println( a and b  ) // a.and(b)




    class Calculator(){
        infix fun addplus10(num1:Int) :Int = num1+10

    }


    //infix is applicable only on single valued parameters.

    var p =Calculator()
    print( p addplus10 10)  // p.addplus10(10)

}