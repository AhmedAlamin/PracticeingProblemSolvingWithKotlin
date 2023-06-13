package com.example.practiceingproblemsolvingwithkotlin.sheet1

import androidx.annotation.Nullable
import java.io.Serializable

fun main() {


    var (size, d) = readLine()?.split(" ") ?: listOf(0, 0)


    // this how to declare an list and fill it using readline()
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