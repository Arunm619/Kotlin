package FlowControl

fun main(args: Array<String>) {

    //normal for loop with range
    for (i in 1..5) {
        print(i)
    }


    println()


    //one liner
    for (i in 1..5) print(i)

    println()


    //downTo keyword default step 1
    for (i in 5 downTo 1) print(i)

    println()

    for(i in 10 downTo 1 step 2) print(i.toString() +", ")


    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in language)
        println(item)




  //for iterating through indices
    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }



    //traversing through each char
    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }


    println()

    for(item in text.indices)
        println(text[item])
}