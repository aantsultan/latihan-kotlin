package com.latihan.kotlin.oop.app

import com.latihan.kotlin.oop.data.Person

fun main() {

    val aant = Person()
    aant.firstName = "Aant"
    val sultan = Person()
    sultan.firstName = "Sultan"

    println(aant)
    println(sultan)

    println(aant.firstName)
    println(sultan.firstName)

}