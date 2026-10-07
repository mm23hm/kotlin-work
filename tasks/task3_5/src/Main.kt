// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.io.path.writeLines

fun main() {
    // Add your code here
    val filepath = Path("text.txt")
    val content = "Hi my name is Haseeb."
    filepath.writeText(content)
    val content1 = " My surname is Mudasar"
    filepath.appendText(content1)

    val fileContent = filepath.readText()
    println(fileContent)
}
