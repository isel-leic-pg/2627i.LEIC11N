val PI = 3.141592

fun main(){
    val r = readDouble("raio")
    val area = circleArea(r)
    println("Area = $area")
}

fun circleArea(radius: Double): Double{
    return PI * radius * radius
}