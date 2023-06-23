package com.example.practiceingproblemsolvingwithkotlin.sheet2

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

        var count = 0
        var boo = true
     for (i in 0 until flowerbed.size-1){
         if (boo){

             if (flowerbed[i] == 0 && flowerbed[i+1]==0 && i+1 < flowerbed.size){
                 count ++
                 boo = false
             }
             if (i>0 && i<flowerbed.size-1 && flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                 count++
                 boo = false
             }

         }else {
             boo = true
         }
     }
        return count>= n
    }
}


