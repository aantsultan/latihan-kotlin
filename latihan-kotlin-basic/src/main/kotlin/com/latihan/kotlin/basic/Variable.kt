package com.latihan.kotlin.basic

const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val firstName: String = "Aant"
    val age: Int = 30

    /**
    * Direkomendasikan memakai val dibandingkan dengan var, karena bersifat Immutable jika ingin
    * membuat variabel yang tidak akan berubah
    * */

    println(firstName)
    println(age)

    /**
     * Tanda tanya ? menunjukan hanya jika terdapat variable memiliki nilai null
     *
     * */

    var name: String? = null
    println(name)
    println(name?.length)

    name = "aant"
    println(name)
    println(name?.length)

    print("$APP : $VERSION")
}