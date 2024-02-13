//fun while16(p: Double){
//    var a = 10.0
//    var co = 0
//    while (a<=200){
//        a += a * p/100
//        co++
//    }
//    println("$a $co")
//
//}
//fun main(){
//    val p = 20.0
//    while16(p)
//
//}

//fun while17(){
//    val n = 24
//    val sot = n /100
//    val des = (n/10)%10
//    val edi = (n%100)%10
//println("$sot   $des   $edi")
//
//}
//fun main(){
//    while17()
//}

fun while18(n: Double) {
    var d= n
    var a= 0

    var b = 0
    while (n>100.0)
        d /= 100.0
    a++


while(n>10){
    d /=10
    b++


}
val c = n%10


    println("$a   $b  $c    $a+$b+$c")
}

fun main(){
    val n = 129.0
    while18(n)
}