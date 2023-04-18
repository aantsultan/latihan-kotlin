package com.latihan.kotlin.basic

fun main() {

    val ints: IntProgression  = 100 downTo 1
    val longs: LongRange = 1 until  100L
    val range: CharRange = 'a' until 'z'
    val rangeWithStep = 1..100 step 5
    val rangeWithStep2 = 100 downTo 1 step 5

    val countLength: String = """
        ints : ${ints.count()} ,
        longs : ${longs.count()} ,
        range: ${range.count()}
    """.trimIndent()

    println(countLength)
    println(ints.contains(20))
    println(ints.contains(200))
    println(ints.first)
    println(ints.last)
    println(ints.step)
    println(rangeWithStep.count())
    println(rangeWithStep2.count())
    println(rangeWithStep.contains(3))
}