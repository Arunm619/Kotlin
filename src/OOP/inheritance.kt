package OOP


//inheritance
//It allows user to create a new class (derived class)
// from an existing class (base class).

open class HumanBeing(_name:String , _age: Int)
{
    var name : String
    var age : Int
    init {
        name = _name.capitalize()
        age = _age
    }
}


class MathTeacher(_name:String , _age: Int) : HumanBeing(_name , _age){
    fun teachMath()
    {
        println("I teach Math")
    }
}

class Actor(_name:String , _age: Int) : HumanBeing(_name , _age){
    fun act()
    {
        println("I am IronMan")
    }
}

class Singer(_name:String , _age: Int) : HumanBeing(_name , _age){
    fun sing()
    {
        println("I'm Unstoppable")
    }
}






open class Logger {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLogger: Logger {
    constructor(_data: String): super("From AuthLog -> + $_data", 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}



//Overriding member functions

// Empty primary constructor
open class MyPerson() {
    open fun displayAge(age: Int) {
        println("My age is $age.")
    }
}


//If the base class and the derived class contains a member function (or property) with the same name,
// you can need to override the member function of the derived class using override keyword,
// and use open keyword for the member function of the base class.

class Girl: MyPerson() {



    override fun displayAge(age: Int) {

        //Calling Members of Base Class from Derived Class
        //You can call functions (and access properties) of the base class from a derived class
        // using super keyword.


        super.displayAge(age)

        println("My fake age is ${age - 5}.")
    }
}



fun main(args: Array<String>) {

    //  var human = HumanBeing("arun",20)
    //  println(human.age.toString() + human.name.toString())

    var mathTeacher = MathTeacher(_name = "Geetha",_age = 40)
    mathTeacher.teachMath()


    var tonyStark = Actor(_name = "tonyStark",_age = 30)
    tonyStark.act()


    var sid = Singer(_name = "Sid Sreram",_age = 29)
    sid.sing()


    val girl = Girl()
    girl.displayAge(31)






}

