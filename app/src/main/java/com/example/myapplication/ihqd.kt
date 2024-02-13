// Базовый класс для всех типов уток
//open class Duck(private val name: String, private val color: String) {
//    // Общий метод для всех уток - плавать
//    fun swim() {
//        println("$name плавает")
//    }
//
//    // Общий метод для всех уток - возвращать название и цвет
//    fun getInfo() {
//        println("Название: $name, Цвет: $color")
//    }
//}// Класс для настоящей утки
//class MallardDuck(name: String, color: String): Duck(name, color) {
//    // Метод для настоящей утки - лететь
//    fun fly() {
//        println("$name летит")
//    }
//
//    // Метод для настоящей утки - крякнуть
//    fun quack() {
//        println("$name крякает")
//    }
//}
//
//// Класс для резиновой утки
//class RubberDuck(name: String, color: String): Duck(name, color) {
//    // Метод для резиновой утки - крякнуть
//    fun quack() {
//        println("$name крякает")
//    }
//}
//
//// Класс для деревянной утки
//class WoodenDuck(name: String, color: String): Duck(name, color) {
//    // Метод для деревянной утки - лететь
//    fun fly() {
//        println("$name летит")
//    }
//}
//
//// Класс для роботизированной утки
//class RoboticDuck(name: String, color: String): Duck(name, color) {
//    // Метод для роботизированной утки - крякнуть
//    fun quack() {
//        println("$name крякает")
//    }
//
//    // Метод для роботизированной утки - лететь
//    fun fly() {
//        println("$name летит")
//    }
//}
//
//fun main() {
//// Создание объектов уток различных типов
//    val mallardDuck = MallardDuck("Настоящая утка", "Коричневый")
//    val rubberDuck = RubberDuck("Резиновая утка", "Желтый")
//    val woodenDuck = WoodenDuck("Деревянная утка", "Коричневый")
//    val roboticDuck = RoboticDuck("Роботизированная утка", "Серебристый")
//
//// Демонстрация функциональности каждого типа утки
//    mallardDuck.fly()
//    mallardDuck.quack()
//    mallardDuck.swim()
//    mallardDuck.getInfo()
//
//    rubberDuck.quack()
//    rubberDuck.swim()
//    rubberDuck.getInfo()
//
//    woodenDuck.fly()
//    woodenDuck.swim()
//    woodenDuck.getInfo()
//
//    roboticDuck.quack()
//    roboticDuck.fly()
//    roboticDuck.getInfo()
//}