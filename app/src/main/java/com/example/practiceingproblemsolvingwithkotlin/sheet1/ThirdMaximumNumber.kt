package com.example.practiceingproblemsolvingwithkotlin.sheet1


fun thirdMax(nums: IntArray): Int {
        var max1: Int? = null
        var max2: Int? = null
        var max3: Int? = null

        for (num in nums) {
            if (num == max1 || num == max2 || num == max3) {
                continue
            }

            when {
                max1 == null || num > max1 -> {
                    max3 = max2
                    max2 = max1
                    max1 = num
                }
                max2 == null || num > max2 -> {
                    max3 = max2
                    max2 = num
                }
                max3 == null || num > max3 -> {
                    max3 = num
                }
            }
        }

        return max3 ?: max1 ?: Int.MIN_VALUE
}
