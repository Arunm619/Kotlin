package FlowControl

fun main(args: Array<String>) {


    //Switch replacement in kotlin is when

    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")


    //few possiblities
    val n = 9
    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }



    //in range
    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }


/*
    To check data type
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
*/


    val a1 = 11
    val n1 = "11"

    when (n1) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        a1.toString() -> println("Bingo! It's eleven.")
    }
}