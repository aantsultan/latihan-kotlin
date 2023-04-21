package com.latihan.kotlin.oop.app

import com.latihan.kotlin.oop.data.Car

fun main() {

    val avanza = Car("Toyota")
    avanza.year = 2015

    val almaz = Car("Wuling", 2019)

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)

}