fun while15(p: Double){
    var mon = 0
    var a =1000.0
    while(a<= 1100) {
        a += a * p / 100
        mon++
    }
println("$mon $a")
}
fun main(){
    val p = 2.0
    while15(p)
}
