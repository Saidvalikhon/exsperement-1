/*
Генератор таблицы умножения:
Напишите программу, которая генерирует таблицу умножения для заданного числа.
* */

fun main() {
    val a= 10
    val b = 30
   println(" ${for2(a,b)}")
}
fun tab(){

    for (i in 1..1){
        for (j in 1..9){
            print("${i * j}  ")
        }
    println()
    }

}

fun for1(){
    val k = 4
    val n = 7
    for(i in 1..n){
        println(k)
    }
}

fun for2(a: Int, b: Int): Int {
    var co = 0
    for (i in a..b) {
        println(i)
        co++
    }
return co

}


fun for4(){
    val cen1 = 5
    for (i in 1..10)
        println(i*cen1)
}

fun for7(){
    val a = 1
    val b = 9
    var sum = 0
    var sam = 0
    for (i in a..b){
        sum += i
        sam ++



    }
        println(sum/sam)


}

//fun for8(a: Int, b: Int): Long{
//    var boss = 1L
//    for (i in a..b) {
//        boss *= i
//    }
//        return boss
//
//}
//fun main(){
//    val a = 10
//    val b = 50
//    println("${for8(a,b)}")
//}