fun mai(n: Int): Int{
    var nul = n
    var count = 0
    while (nul>1) {
        nul /= 2
        count++
    }
    return count

}
fun main(){
    val n = 16
    println("${mai(n)}")
}