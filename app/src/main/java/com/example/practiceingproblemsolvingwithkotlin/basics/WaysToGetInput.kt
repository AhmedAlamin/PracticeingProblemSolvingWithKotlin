package com.example.practiceingproblemsolvingwithkotlin.basics



fun main() {

    // Ways to get input from user using readLine() function

    // #1 Reading a single line of text:
    print("Enter your name: ")
    val name = readLine()
    println("Hello, $name!")


    //#2 Reading an integer:
    print("Enter your age: ")
    val age = readLine()?.toInt()
    println("You are $age years old.")

    //#3 Reading multiple values on a single line:
    print("Enter two numbers (separated by a space): ")
    try {
        val (num1, num2) = readLine()?.split(" ")?.map { it.toInt() } ?: listOf(0, 0)
        println("Sum: ${(num1 + num2)}")
    }catch (e:java.lang.NumberFormatException){ // way to catch Exceptions in kotlin
        print("Error of type Number Format")
    }


    // #4 Read the first char of input line
    print("Enter a character: ")
    val char = readLine()?.firstOrNull() // Reads the first Char
    println("You entered: $char")

    // #5 Read using generateSequance() function
    var lines = generateSequence { readLine() }.map {
        line-> line.split(" ").take(2)
    }.take(1).toMutableList()


    // #6 making 2d mutable list
//    val matrix: MutableList<MutableList<Int>> = MutableList(rows) { MutableList(cols) { 0 } }



}