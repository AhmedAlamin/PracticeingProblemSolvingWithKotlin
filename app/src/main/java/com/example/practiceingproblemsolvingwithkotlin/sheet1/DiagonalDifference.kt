package com.example.practiceingproblemsolvingwithkotlin.sheet1

import kotlin.math.abs

fun main() {

   val n = readLine()?.firstOrNull()?:0


    val matrix = generateSequence { readLine() }.map {
        line-> line.split(" ").take(n.toString().toInt())
    }.take(n.toString().toInt()).toMutableList()

    var leftSum = 0
    var rightSum = 0

    for ((index,value) in matrix.withIndex()){
        leftSum += matrix[index][index].toInt()
    }
    for ((index,value) in matrix.withIndex()){
        rightSum += matrix[index][matrix.size-1-index].toInt()

    }
    println(abs(leftSum-rightSum))

}