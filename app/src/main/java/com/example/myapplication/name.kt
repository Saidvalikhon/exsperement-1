fun productBetweenNumbers(a: Int, b: Int): Long{
    var p = 1L
    for (i in a..b){
        p *= i
    }
    return p
}
fun main(){
    val a = 10
    val b = 49
    println("${productBetweenNumbers(a,b)}")
}

