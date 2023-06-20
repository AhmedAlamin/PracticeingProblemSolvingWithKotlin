package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val n = readLine()?.toIntOrNull() ?: 0

    var numOfZeros = 0.0f
    var numOfPositive = 0.0f
    var numOfNegative = 0.0f

    val line = generateSequence { readLine() }.map { line ->
        line.split(" ").take(n)
    }.take(1).toMutableList()

    for (index in 0 until n){
        if (line[0][index].toInt() > 0) numOfPositive ++
        else if  (line[0][index].toInt() < 0) numOfNegative++
        else numOfZeros++
    }



    print(String.format("%.6f",(numOfPositive/n)) +"\n"
            +String.format("%.6f",(numOfNegative/n)) +"\n"
            + String.format("%.6f",(numOfZeros/n)) + "\n")


}