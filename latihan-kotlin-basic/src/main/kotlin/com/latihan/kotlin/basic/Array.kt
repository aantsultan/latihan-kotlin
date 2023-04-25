package com.latihan.kotlin.basic

fun main() {

    var names: Array<String> = arrayOf("Aan", "berhobi", "Games", "dan", "Anime")

    names.set(1, "Elkia")

    println(names)
    println(names[0])
    println(names[1])
    println(names.get(2))
    println(names[2])
    println(names.joinToString {name -> "$name"})

    var numbers: Array<Int> = arrayOf(1,2,3, -1, 10, 4)
    numbers.sort()
    println(numbers.joinToString { numbers -> "${numbers}" })
    numbers.reverse()
    println("reverse : " + numbers.joinToString { numbers -> "$numbers" })

}