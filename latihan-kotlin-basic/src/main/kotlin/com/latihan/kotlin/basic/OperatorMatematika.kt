package com.latihan.kotlin.basic

fun main() {
    var result1: Int = 10 / 3
    println(result1)

    var result2: Int = 10 + 10 / 2
    println(result2)

    var result3: Double = 10.0 / 3.0
    println(result3)

    var total: Int = 0
    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3
    println(total)

    total++
    println(total)
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}