package Functions

import java.math.BigInteger

fun fact(n:Long) : Long {
    if (n==1L) return 1
    else
        return fact(n-1)*n
}

fun main(args: Array<String>) {


    for (i in (1..10))
        println(fact(i.toLong()))


    print("\n")

    val a = BigInteger("0")
    val b = BigInteger("1")

     print(fibonacci(n=10,a=a,b=b))

    println(factorial(n=100))
}



//Tail recursion

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}



 tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}