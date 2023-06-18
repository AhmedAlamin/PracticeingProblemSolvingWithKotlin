package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val n = readLine()?.toIntOrNull()?:0
    var max = -1

    var list = mutableListOf<Int>()
    readLine()?.split(" ")?.take(n)?.map {
        list.add(it.toInt())
    }

    for (i in 0 until list.size){
        if (list[i]>max){
            max = list[i]
        }
    }
    var counter = 0
    for (i in 0 until list.size){
        if (list[i] == max) counter++
    }

    println(counter)



}