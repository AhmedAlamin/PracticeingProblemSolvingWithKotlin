package com.example.practiceingproblemsolvingwithkotlin.sheet1

fun main() {

    val line = generateSequence { readLine() }.map {
        line-> line.split(" ").take(5)
    }.take(1).toMutableList()


    var list = mutableListOf<Long>()
    var sum:Long = 0

   for ( i in 0 until 5){
       for (j in 0 until 5){
           if (j != i) {
               sum+= line[0][j].toString().toLong()
           }
       }

       list.add(sum)
       sum = 0

   }

  print(list.min().toString() +" "+list.max().toString())

}