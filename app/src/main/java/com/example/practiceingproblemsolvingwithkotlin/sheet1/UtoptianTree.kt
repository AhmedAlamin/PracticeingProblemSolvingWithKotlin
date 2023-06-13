package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val n = readLine()?.firstOrNull()?:0

    val lines = generateSequence(readLine()){
        readLine()
    }.take(n.toString().toInt()).toMutableList()


    var start =1
    for ((index,_) in lines.withIndex()){
        for (i in 0 until lines[index].toInt()){
            if (i % 2==0) start*=2
            else start++
        }
        lines[index] = start.toString()
        start = 1
    }

    for (i in lines){
        println(i)
    }
}