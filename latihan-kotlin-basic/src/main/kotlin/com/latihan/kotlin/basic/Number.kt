package com.latihan.kotlin.basic

fun main() {

    var input: Int = 10
    var inputLong: Long = 10L
    var inputFloat: Float = 10.00F

    var inputLongConvert: Long = input.toLong()
    var inputFloatConvert: Float = input.toFloat()
    var inputByteConvert: Byte = input.toByte()

    println(input)
    println(inputLong)
    println(inputFloat)
    println(inputLongConvert)
    println(inputFloatConvert)
    println(inputByteConvert)

}