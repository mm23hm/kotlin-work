// Task 4.7: finding the longest line in a file
import kotlin.io.path.*
import java.io.File

fun main(args: Array<String>){
    val filePath = Path(args[0])
    var line_size = 0
    var longest_line = 0
    var longest_line_number = 0

    filePath.useLines{

        for((index,line) in it.withIndex()){
            line_size = line.length
            if (line_size > longest_line){
                longest_line = line_size
                longest_line_number = index + 1 // +1 is neede as index starts at 0
            }
        }

        println("Line ${longest_line_number} is the longest (length = ${longest_line})")
    }
}