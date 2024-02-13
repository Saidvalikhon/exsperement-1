

fun man(a: Int, b: Int): Long{
    var s = 0L
    for(i in a..b) {
        s += i * i
    }
    return s


}
fun main(){
    val a = 5
    val b = 7
    println("${man(a,b)}")

}