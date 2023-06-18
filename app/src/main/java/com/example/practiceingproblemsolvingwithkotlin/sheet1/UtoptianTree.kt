package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val n = readLine()?.toIntOrNull()?: 0


    var list = mutableListOf<Int>()
    repeat(n){
        list.add(readLine()?.toIntOrNull()?:0)
    }

    var start = 1
    for (i in 0 until list.size){
        for (j in 1 .. list[i]){
            if (j%2 ==1) start*=2
            else start++
        }
        list[i] = start
        start = 1
    }
    repeat(n){
        println(list[it])
    }

}


