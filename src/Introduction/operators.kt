package Introduction

fun main(args: Array<String>) {


    //Artithmetic operators
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")


    //String concatenation

    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val res = start + middle + end
    println(res)


    //Assignment Operators
    /*

     =
    +=
    -=
    *=
    /=

    */

    //Unary operators
   // + - ! ++ --

    val a = 1
    val b = true
    var c = 1

    var res1: Int
    var booleanResult: Boolean

    res1 = -a
    println("-a = $res1")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")

    //Comparison and Equality Operators
    /*


        >
        <
        !=
        ==
        >=
        <=


     */


    val a1= -12
    val b1 = 12

    // use of greater than operator
    val max = if (a1 > b1) {
        println("a is larger than b.")
        a1
    } else {
        println("b is larger than a.")
        b1
    }

    println("max = $max")


   //in operator , invoke operator

    //logical operator
    // && ||
    if(1 is Int && true is Boolean)
    println("true bro")

    //Also, there is no ternary operator in Kotlin unlike Java.


}