package com.example.myapplication

fun main(){
    val bombCout = 4
    val array : Array<Array<Int>> = Array( 12){Array( 12){0}}
    val rowCount :Int = array.size
    for (i :Int in 0..<bombCout){
        val x :Int = (0..<10).random()
    }

}