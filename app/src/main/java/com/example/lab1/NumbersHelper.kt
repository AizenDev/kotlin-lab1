package com.example.lab1


import kotlin.random.Random

class NumbersExercise: Helper() {

    var numbers: List<Int> = listOf()

    init {
        updateNumbers()
    }

    fun updateNumbers(){
        numbers = List(10){ Random.nextInt(1, 10) }
    }


    fun replaceElementsGreaterThanZ(list: List<Int>, z: Int): Pair<List<Int>, Int> {
        var count = 0
        val replacedList = list.map {
            if (it > z) {
                count++
                z
            } else {
                it
            }
        }
        return Pair(replacedList, count)
    }


    override var result: String
        get() = numbers.joinToString()
        set(value) {}
}


