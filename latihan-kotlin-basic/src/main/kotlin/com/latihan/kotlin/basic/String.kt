package com.latihan.kotlin.basic

fun main() {

    var nama: String = "Aant"
    var hobi: String = "Musik, games, ngoding"
    var alamat: String = """
       Halo nama Saya aant, memiliki hobi mendengarkan musik, bermain games, dan ngoding 
    """.trimIndent()

    var profile: String = "Saya " + nama + " dan memiliki hobi : " + hobi
    var profileV2: String = "Saya ${nama} dan memiliki hobi : ${hobi}"
    var desc: String = "Variabel profile memiliki panjang String : ${profile.length}"

    println(alamat)
    println(profile)
    println(profileV2)
    println(desc)

}