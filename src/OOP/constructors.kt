package OOP

fun main(args: Array<String>) {
    //A constructor is a concise way to initialize class properties
    //two types of constructors
    //1.Primary
    //2.Secondary

    val person1 = Person("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")


    var log = Log(data = "Wifi Connection failed")
    var log2 = Log(data = "Error  ", numberOfData = 10)


    var authLog = AuthLog(data = "Error ", numberOfData = 404)


}


//Primary constructor

class Person(_firstName: String = "Unknown", _age: Int = 0) {
    val firstName: String
    var age: Int

   init{
       firstName = _firstName.capitalize()
       age = _age

       println("Initialised....")

   }
}


//secondary constructor

open class Log {
    constructor(data: String) {
        // some code
        println(data)
    }
    constructor(data: String, numberOfData: Int) {
        println(data +" "+ numberOfData.toString())
    }
}



class AuthLog: Log {
    constructor(data: String): super("From Auth -> $data") {
        // code
    }
    constructor(data: String, numberOfData: Int): super("From Auth -> $data", numberOfData) {
        // code
    }
}