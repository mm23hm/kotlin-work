fun median(data: List<Float>): Float {

    // Throw an exception if the list is empty
    if (data.isEmpty()) {
        throw IllegalArgumentException("List cannot be empty")
    }

    val sorted = data.sorted()
    val size = sorted.size
    val middle = size / 2

    // Calculate the median
    if (size % 2 == 0) {
        return (sorted[middle - 1] + sorted[middle]) / 2
    } else {
        return sorted[middle]
    }
}

fun displayStats(data: List<Float>) {

    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}