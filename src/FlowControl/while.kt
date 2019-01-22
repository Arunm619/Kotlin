package FlowControl

fun main(args: Array<String>) {


    //while loop

    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }



    //do...while loop
    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")

}