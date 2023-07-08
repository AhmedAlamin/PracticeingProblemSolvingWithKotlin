package com.example.practiceingproblemsolvingwithkotlin.sheet1

import kotlin.math.max


    fun maxProfit(prices: IntArray): Int {


        var maxProfit = Int.MIN_VALUE
        var maxNumber = prices[prices.size-1]

        for (i in (prices.size-1) downTo 0){
            maxNumber = max(maxNumber,prices[i])
            if (maxNumber - prices[i] > maxProfit){
                maxProfit = maxNumber - prices[i]
            }

        }

        return if (maxProfit.equals(Int.MIN_VALUE)) 0
        else maxProfit


    }
