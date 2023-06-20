package com.example.practiceingproblemsolvingwithkotlin.sheet1


fun romanToInt(s: String): Int {
    var constants = hashMapOf<String, Int>()

    constants["I"] = 1
    constants["V"] = 5
    constants["X"] = 10
    constants["L"] = 50
    constants["C"] = 100
    constants["D"] = 500
    constants["M"] = 1000


    var sum = 0
    for (index in s.indices) {


        if (index + 1 < s.length && constants[s[index].toString()]!! < constants[s[index + 1].toString()]!!) {
            sum -= constants[s[index].toString()]!!

        } else {
            sum += constants[s[index].toString()]!!
        }

    }

    return sum
}
