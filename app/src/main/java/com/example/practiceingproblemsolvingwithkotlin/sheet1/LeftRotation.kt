package com.example.practiceingproblemsolvingwithkotlin.sheet1

import androidx.annotation.Nullable
import java.io.Serializable

fun main() {


    var (size, d) = readLine()?.split(" ") ?: listOf(0, 0)

    // 1, 2 ,3 ,4 ,5
    var list = mutableListOf<Int>()


    readLine()?.split(" ")?.forEachIndexed { index, s ->

        if (index < size.toString().toInt()) {
            list.add(s.toInt())
        }
    }


    for ((index, _) in list.withIndex()) {
        if (index > d.toString().toInt()-1) {
            print("${list[index]} ")
        }
    }

    for ((index, _) in list.withIndex()) {
        if (index < d.toString().toInt()) {
            print("${list[index]} ")
        } else return

    }


}