// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5) // use this instead to assign values and use function like add ect.
    numbers.add(1)
    println(numbers)
}

val numbers = buildList {
    filePath.forEachLine {
        add(it.toFloat())
    }
}

// buildList is used for adding fiules lines to the list it is beter and more efficient than mutableListOf
