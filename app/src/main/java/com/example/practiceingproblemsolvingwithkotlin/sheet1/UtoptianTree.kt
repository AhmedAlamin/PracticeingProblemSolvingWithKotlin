package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val n = readLine()?.firstOrNull()?:0

    val lines = generateSequence(readLine()){
        readLine()
    }.take(n.toString().toInt()).toMutableList()


    var start =1
    for ((index,_) in  lines.withIndex()){
        for (i in 1 .. lines[index].toInt()){
            if (i % 2 == 1) start *= 2
            else start +=1
        }
        lines[index] = start.toString()
        start = 1
    }

    for (i in lines){
        println(i)
    }
}


