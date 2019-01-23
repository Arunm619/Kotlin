package OOP



class Student {
    var name: String = "defaultValue"


    //throws warning = redudant getter
    get() = field

        //throws warning = redudant setter
        set(value) {
        field = value
    }





}


//In Kotlin, getters and setters are optional and are auto-generated
// if you do not create them in your program.

fun main(args: Array<String>) {

    var arun = Student()
    println(arun.name)
    arun.name = "Arun sudharsan"
    println(arun.name)
}
