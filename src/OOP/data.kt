package OOP

//There may arise a situation where you need to create a class solely to hold data.
// In such cases, you can mark the class as data to create a data class.


data class Cab(var id:Int ,var model:String)
data class User(var name: String, var age: Int)

fun main(args: Array<String>) {
    val arun = User("Arun", 20)
    println("name = ${arun.name}")
    println("age = ${arun.age}")


//When you declare a data class,
// the compiler automatically generates several functions such as
// toString(), equals(), hashcode() etc behind the scenes.

//Bye bye boiler plate code.


    val ak = arun.copy(name="ak")

    println(arun.toString())
    println(ak.toString())

    if(arun.hashCode() == ak.hashCode())
    {
        println("They are same")

    }
    else
    {
        print("No they have different values")
    }

    println()


    //Destructuring Declarations

    val(name, age) = ak
    println(name)
    println(age)

    //componentN same but built by kotlin for us. :*

    println(ak.component1())
    println(ak.component2())

}