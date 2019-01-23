package Functions

fun drawBorder(ch: Char = '=' , times :Int = 10)
{
    for(i in (1..times)) print(ch.toString() + " ")
    println()
}

fun main(args: Array<String>) {



    //calling default arguments fun with all required parameters
    drawBorder()

    //with few params
    drawBorder('*')

    //with all params
    drawBorder('-', 20)



    //named argument concept is same like turning on hints in jetbrains

    //with few params
    drawBorder(ch ='*')

    //with all params
    drawBorder(ch  = '-', times = 20)



}