package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    var (size,k) = readLine()?.split(" ")?: listOf(0,0)
    var max:Int = 0


    readLine()?.split(" ")?.forEachIndexed { index, s ->
        if (index<size.toString().toInt()){
            if (s.toInt()>max){
                max = s.toInt()
            }
        }
    }

    if (max < k.toString().toInt()){
        println("0")
    }else{
        println(max-k.toString().toInt())
    }

}