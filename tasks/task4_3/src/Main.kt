// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess // Used it for Exit code

import kotlin.math.roundToInt// Usded it for accurate result when rounding th average of the 3 tests



fun main(args: Array<String>){
    val test1result = args[0].toInt()
    val test2result = args[1].toInt()
    val test3result = args[2].toInt()

    if((args.size != 3) || (!(test1result in 0..100)&&
                            test2result in 0..100 && // Checking if all 3 of the args are in range 0-100
                            test3result in 0..100))// Would have preffered to use for loop but I guess we learning that in the next tasks
    {
        println("ERROR: Enter 3 number and in range between 0 and 100 please!")
        exitProcess(1)
    }
    val average = ((test1result + test2result + test3result)/3.0).roundToInt()

    val grade = when (average){
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Fail"
    }

    println("Average : ${average}")
    println("Grade   : ${grade} ")

}