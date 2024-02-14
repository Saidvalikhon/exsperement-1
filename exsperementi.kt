package com.example.gitstart

abstract class Transport(val model: String, val number: String){
    abstract var speed: Int
    abstract fun move()
    abstract fun stop()
}

class Car( model: String, number: String): Transport(model, number) {
    override var speed = 60
    override fun move() {
        println("sdlfsdfm $speed")
    }

    override fun stop() {
        println("stop $model")

    }

}

fun main() {
    val tesla: Car = Car("Tesla", "2104qwe")


    tesla.move()
    tesla.stop()
}