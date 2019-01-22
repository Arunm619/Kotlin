package FlowControl

fun main(args: Array<String>) {
    val number = -10

    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }


    //one liner
    val result = if (number > 0) "Positive number" else "Negative number"

    println(result)



        //multiple expressions if block

    val a = -9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")


    //if else ladder
    //nested if else
        // these are same like java

}