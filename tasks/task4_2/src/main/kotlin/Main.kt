// Task 4.2: use of if and ranges

fun main() {
    println("Please select a pizza option: a/b/c/d")
    val option = readln().lowercase()
    if(option[0] in 'a'..'d'){
        println("Order accepted")
    }
    else{
        println("Invalid choice!")
    }
}
