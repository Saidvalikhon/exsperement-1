//interface Movable{
//    val speed: Int
//    fun stop(){
//        println("stop")
//    }
//
//    fun move(){
//        println("car driving speed $speed ")
//    }
//}
//interface Info{
//    val model: String
//    val number: String
//}
//
//class Car(override val model: String, override val number: String) : Movable, Info{
//
//    override val speed = 60
//    override fun move(){
//        println("car drivin $speed")
//    }
//}
//class Air(override val model: String, override val number: String) : Movable, Info{
//
//    override val speed = 600
//    override fun move(){
//        println("air letit $speed")
//    }
//override fun stop(){
//    println("air prizemlaetsya")
//
//
//}
//
//}
//
//
//
//fun main(){
//    val tesla: Car = Car("Tesla", "2139ASGl")
//
//    println(tesla.model)
//    println(tesla.number)
//
//    tesla.move()
//    tesla.stop()
//
//val air : Air = Air("bta 40", "912399sda")
//println(air.model)
//    println(air.number)
//air.move()
//    air.stop()



//}