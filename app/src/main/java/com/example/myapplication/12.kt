// Базовый класс для всех уток
//abstract class Duck(val name: String, val color: String) {
//    open fun quack() {
//        println("$name крякает!")
//    }
//
//    open fun swim() {
//        println("$name плавает!")
//    }
//
//    open fun fly() {
//        println("$name летает!")
//    }
//}
//
//// Класс для настоящих уток
//class RealDuck(name: String, color: String) : Duck(name, color)
//
//// Класс для резиновых уток
//class RubberDuck(name: String, color: String) : Duck(name, color) {
//    override fun fly() {
//        println("Резиновая утка не может летать!")
//    }
//}
//
//// Класс для деревянных уток
//class WoodenDuck(name: String, color: String) : Duck(name, color) {
//    override fun quack() {
//        println("Деревянная утка не может крякать!")
//    }
//}
//
//// Класс для роботизированных уток
//class RoboticDuck(name: String, color: String) : Duck(name, color) {
//    override fun swim() {
//        println("Роботизированная утка не может плавать!")
//    }
//}
//
//fun main() {
//    val realDuck = RealDuck("Настоящая утка", "Зеленый")
//    realDuck.quack()
//    realDuck.swim()
//    realDuck.fly()
//
//    val rubberDuck = RubberDuck("Резиновая утка", "Желтый")
//    rubberDuck.quack()
//    rubberDuck.swim()
//    rubberDuck.fly()
//
//    val woodenDuck = WoodenDuck("Деревянная утка", "Коричневый")
//    woodenDuck.quack()
//    woodenDuck.swim()
//    woodenDuck.fly()
//
//    val roboticDuck = RoboticDuck("Роботизированная утка", "Серый")
//    roboticDuck.quack()
//    roboticDuck.swim()
//    roboticDuck.fly()
//}