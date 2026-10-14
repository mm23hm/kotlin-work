// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry
// Haseeb Mudasar
// Student ID: 201712687
// import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(t: Triangle): Boolean{

    val a = t.first
    val b = t.second
    val c = t.third

    return ((a+b > c) && (a+c > b) && (c+b > a))
}

fun triangleArea(t: Triangle): Double{
    val a = t.first
    val b = t.second
    val c = t.third

    val sp = (a+b+c)/2.0  // Calculating Semi-Perimeter
    return sqrt(sp*(sp-a)*(sp-b)*(sp-c)) // Calculating Area
}
// Add isValidTriangle() and triangleArea() functions here
