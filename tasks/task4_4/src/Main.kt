// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {

    val t = Terminal()

    val init_temp = args[0].toDouble()
    val max_temp =  args[1].toDouble()
    val incr_temp = args[2].toDouble()

    var temperature = init_temp

    while(temperature <= max_temp){
        t.println(table {
            header { row("Celsius", "Fahrenheit") }
            body { row(temperature, (9.0/5.0)*(temperature) + 32.0)}
        })
        temperature = temperature + incr_temp
    }
}
