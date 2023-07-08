package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {
   println(addBinary("11","5"))
}
    fun addBinary(a: String, b: String): String {


        var num1 = a.toBigInteger(2)
        var num2 = b.toBigInteger(2)

        return (num1+num2).toString(2)
    }


