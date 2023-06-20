package com.example.practiceingproblemsolvingwithkotlin.sheet1

import kotlin.math.max


fun findMaxConsecutiveOnes(nums: IntArray): Int {

    var numberOfOnes = 0
    var maxAnswer = 0

    for (i in nums) {
        if (i == 1) numberOfOnes++
        else {
            if (numberOfOnes > maxAnswer) {
                maxAnswer = numberOfOnes
                numberOfOnes = 0
            } else {
                numberOfOnes = 0
            }
        }
    }

    maxAnswer = max(numberOfOnes, maxAnswer)

    return maxAnswer
}


