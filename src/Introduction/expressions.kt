package Introduction

fun main(args: Array<String>) {
    val score: Int
    score = 90 + 25
    print(score.toString() + "\n")



    //if is a statement in java whereas here it is an expression

    val a = 12
    val b = 13
    val max: Int

    max = if (a > b) a else b
    println("${max}")



    //Kotlin Blocks

    val flag = true

    if (flag == true) {      // start of if block
        print("Hey ")
        print("Arun!")
    }


   // Kotlin Comments
    /* ... */
// ....

    /* This is a multi-line comment.
 * The problem prints "Hello, World!" to the standard output.
 */
   //Comments shouldn't be the substitute for a way to explain poorly written code in English.
    // Write well structured and readable code, and then use comments.
}