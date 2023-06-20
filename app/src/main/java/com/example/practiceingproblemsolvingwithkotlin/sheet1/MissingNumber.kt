package com.example.practiceingproblemsolvingwithkotlin.sheet1


fun missingNumber(nums: IntArray): Int {

    var totalSum = nums.size * (nums.size + 1) / 2
    var arraySum = 0

    for (i in nums) {
        arraySum += i
    }
    return totalSum - arraySum
}
