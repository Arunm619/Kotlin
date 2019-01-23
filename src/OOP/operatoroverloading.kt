package OOP

fun main(args: Array<String>) {
    val a = 5
    val b = 10

    print(a.plus(b)) // print(a+b)

    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")


    var point = Point(3, -8)
    --point

    println("point = (${point.x}, ${point.y})")
}

class Point(val x: Int = 0, val y: Int = 10) {

    // overloading plus function
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }

    operator fun dec() = Point(x-1,y-1)
}

//When you overload operators,
// you should try to maintain the original spirit of the operator.