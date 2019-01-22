package Introduction

import java.util.*

fun main(args: Array<String>) {
    println("Kotlin is interesting.")


    // print() + "\n" is println()

    //reading input from user
    //either using readLine()
    //or Scanner good old one.

    val reader = Scanner(System.`in`)
    val stringInput = readLine()
    println("You entered: $stringInput")

    val number = readLine()!!.toInt()
    print(number+1 )

    val number2 = reader.nextInt()
    print(number2+1 )


    /*
    * To get Long, Float, double and Boolean input from the user,
    * you can use nextLong(),
    * nextFloat(), nextDouble() and nextBoolean() methods respectively.
    *
    * */



}