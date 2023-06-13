package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    var alice = 0
    var bob = 0
    val lines = generateSequence { readLine() }.map {
       line -> line.split(" ").take(3)
    }.take(2).toMutableList()


    for (index in 0 ..  2){
        if (lines[0][index].toInt() > lines[1][index].toInt()){
            alice++
        }else if (lines[0][index].toInt() == lines[1][index].toInt()){

        }else {
            bob++
        }
    }
    println("$alice $bob")
}