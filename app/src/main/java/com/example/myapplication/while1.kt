fun main(){
    var a = 24
    val b = 8


    println("${while2(a,b)}")
}


fun while1(){
    var a = 18
    val b = 8
    while (a>b){
        a -= b
    }
    println(a)

}

fun while2(a: Int,b: Int ): Int{
     var a2 = a
    var c = 0
    while (a2>=b) {
        a2 -= b
        c++
    }
    return c
}
