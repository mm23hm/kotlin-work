// Task 5.2.2: conversion of marks into grades, using a function


fun main(args: Array<String>){
    for((index,n) in args.withIndex()){
        println("${args[index]} is a ${grade(args[index].toInt())}")
    }
}

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}