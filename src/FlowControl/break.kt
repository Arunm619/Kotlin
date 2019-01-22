package FlowControl

fun main(args: Array<String>) {


    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }




    var sum = 0
    var number: Int

    while (true) {
        print("Enter a number: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }

    print("sum = $sum")



    //breaking out of desired loops
    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }
}