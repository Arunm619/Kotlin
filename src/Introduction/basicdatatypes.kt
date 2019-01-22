package Introduction

import java.util.*

fun main(args: Array<String>) {
    var name = "Arun"
    val score = 100

    //either val or var can be used to declare variables
    //no need for type specification this is called type inference

    var name1 : String
    val score1 : Int

    //here we havent initialised the data so kotlin doesnt know the data type
    //have to explicitly give out the data type name.

    name1 = "Maddy"
    score1 = 100


    /*
    *
    val vs var
    val is just immutable reference just like final keyword in java
    val (Immutable reference)
    * */

    val pi: Double = 3.14


    //pi = 2
    //wont work because val (final) cant be reassigned

    //whereas var is mutable reference



    //kotlin is a statically typed language
    //the type of a variable is known during the compile time.

    /*
    Different types

    * Numbers
    * Characters
    * Booleans
    * Arrays

    * */


    /*

    Numbers:
    1.Byte =  [-128, 127]
    2.Short = [-32768, 32767]
    3.Int = [-2^31 to 2^31-1]
    4.Long = [-2^63 to 2^63-1]
    5.Double = double precision 3.14
    6.Float = single precision 3.14F



    */


    //Char

    var alpha : Char = 'A'
    println(alpha)

    //Error
    //var letter: Char = 65  // Error


    //Boolean
    var flag = true
    flag = !flag
    println(flag)



    //Arrays
    var nums = arrayOf(1, 2, 3, "wwe", 5)

    println(Arrays.toString(nums))

    val nums2 = ('a'..'z').toList().toTypedArray()
    println(Arrays.toString(nums2))

    val nums3 = IntArray(5, { i -> i * 2 + 3})
    println(Arrays.toString(nums3))

    println(nums.first())
    println(nums.last())
    println(nums.indexOf(5))



    nums.forEach({ e -> print("$e ") })

    println()

    nums.forEachIndexed({i, e -> println("nums[$i] = $e")})

    for (e in nums) {
        print("$e ")
    }

    println()

    val it= nums.iterator()

    while (it.hasNext()) {

        val e = it.next()
        print("$e ")
    }



    //Strings
    val myString = "Hey there!"
    val myString1: String

    myString1 = "Howdy"

    val s1  = "Hey there!"
    val s2 = "Hey there!"
    var result: String


    val myString2 = "Hey there!"
    var item: Char

    item = myString2[0]    // item contains 'H'
    item = myString2[9]    // item contains '!'
 //   item = myString2[10]   // Error! String index is out of range
 // item =  myString2[-1]  // Error! String index is out of range

    println("Length of s1 string is ${s1.length}.")

    result = if (s1.compareTo(s2) == 0) "equal" else "not equal"
    println("Strings s1 and s2 are $result.")

    // s1.get(2) is equivalent to s1[2]
    println("Third character is ${s1.get(2)}.")

    result = s1.plus(" How are you?") // result = s1 + " How are you?"
    println("result = $result")

    println("Substring is \"${s1.subSequence(4, 7)}\"")

}
