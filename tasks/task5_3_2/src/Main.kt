// Task 5.3.2: main program

fun main(args: Array<String>){

    if (args.size == 0){
        rollDice()
    }
    else{
        val parts = args[0].split("d")
        val dices = parts[0].toInt()
        val sides = parts[1].toInt()
        rollDice(dices= dices, sides= sides)
    }
}