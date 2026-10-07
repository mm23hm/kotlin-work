// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess


fun main(args: Array<String>){
    // Creating a system to check if input on command line is valid
    if (args.size != 3){
        // If not valid print Erro massage and Halt
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    // Assigning the sides of the triangles to values a, b, c and converting to Double
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()
    // Calculating Perimeter
    val s = (a+b+c)/2.0

    // Calculating Area using Heron's formula
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    // Printing Area
    println("Area = ${"%.5f".format(area)}") // 5 decimal places format
}