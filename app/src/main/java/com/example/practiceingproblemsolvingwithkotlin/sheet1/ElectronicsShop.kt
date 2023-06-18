package com.example.practiceingproblemsolvingwithkotlin.sheet1

import kotlin.math.max

fun main() {

    val (b, key, drivers) = readLine()?.split(" ")?.map {
        it.toInt()
    } ?: listOf<Int>(3)

    val keybordList = mutableListOf<Int>()
    val driversList = mutableListOf<Int>()
    var max = -1

    readLine()?.split(" ")?.take(key)?.map {
        keybordList.add(it.toInt())
    }

    readLine()?.split(" ")?.take(drivers)?.map {
        driversList.add(it.toInt())
    }

    for (i in 0 until keybordList.size){
        for (j in 0 until driversList.size){
            if (keybordList[i] + driversList[j] <= b){
                max = max(max,keybordList[i] + driversList[j])
            }
        }
    }

    println(max)

}