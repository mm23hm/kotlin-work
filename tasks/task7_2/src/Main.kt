// Task 7.2: array comparison
fun main() {
    //val numbers = arrayOf(9, 6, 3, 2) // Can contain null
    val numbers = intArrayOf(9, 6, 3, 2) // Cannot contain null. Most effiecient

    val cls = numbers::class

    println(cls.qualifiedName)
    println(cls.java)
}