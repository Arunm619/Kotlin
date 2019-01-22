package Introduction

fun main(args: Array<String>) {

    val number1: Int = 55
    //val number2: Long = number1   // Error: type mismatch.

    val number2: Long = number1.toLong() //Valid

/*
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

 */

    //no type conversion for boolean

    val num1: Int = 545344
    val num2: Byte = number1.toByte()
    println("number1 = $num1")
    println("number2 = $num2")

}