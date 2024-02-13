fun main(){
    qaz()


}
fun sum() {
    val a = -10
    val b = -5
    val c = 2

    if (a > 0 && b > 0) {
        println(true)
    } else if (a > 0 && c > 0) {
        println(true)
    } else if (c > 0 && b > 0) {
        println(true)
    } else {
        println(false)
    }
}


fun sd(){
    val a = 3
    val b = 6
    val c = 9
    if (c > b && b > a) {
        println(true)
    }
else {
    println(false)
    }

}
fun boolean23() {
    val a = 1221
    val s = a / 1000
    val d = a % 1021
    val f = a - 1201
    val g = a % 1220

println(s)
    println(d)
    println(f)
    println(g)
    if (s == g && d==f) {
        println(true)

    }
    else
        println(false)
}


fun boolean40(){
    val x1 = 5
    val y1 = 5
    val x2 = 3
    val y2 = 4
    val s1 = x1 + 1
    val z1 = y1 + 2
    val s2 = x1 - 1
    val z2 = y1 + 2
    val s3 = x1 + 2
    val z3 = y1 + 1
    val s4 = x1 - 2
    val z4 = y1 + 1
    val s5 = x1 - 2
    val z5 = y1 - 1
    val s6 = x1 - 1
    val z6 = y1 - 2
    val s7 = x1 + 1
    val z7 = y1 - 2
    val s8 = x1 + 2
    val z8 = y1 - 1

    if(x2 == s1 && y2 == z1){



     println(true)


    }
    else if(x2 == s2 && y2 == z2){
        (x2 == s2 && y2 == z2)
        println(true)

    }
    else if ((x2 == s3 && y2 ==z3 )){
        println(true)

    }
    else if(x2 == s4 && y2 ==z4 ){
        (x2 == s4 && y2 ==z4 )
        println(true)



    }
    else if(x2 == s5 && y2 == z5){



        println(true)


    }
    else if(x2 == s6 && y2 == z6){
        (x2 == s6 && y2 == z6)
        println(true)

    }
     else if ((x2 == s7 && y2 == 7)){
        println(true)

    }
    else if ((x2 == s8 && y2 ==z8 )){

        println(true)

    }
    else{
        println(false)
    }




}


fun qw(){
    val a = 30
    val b = 21
    val c = 9

if (Math.abs(a+b) > Math.abs(b+c) && Math.abs(a+b)>Math.abs(a+c)){
    println(Math.abs(a+b))
}
    else if (Math.abs(a+c) < Math.abs(b+c) && Math.abs(b+c) > Math.abs(a+b)){
     println(Math.abs(b+c))
}
    else{
    println((Math.abs(a+c)))
    }

}


fun qwe(){
    val s = 100
    val number = when {
        s  > 9  && s < 99 && (s%2==0) -> "chet dvuh chislo"
        s > 99 && s < 999 && s % 2 != 0 ->"ne chet treh chislo"


        else -> "chislo menshe 9 ili ne delitsa na 2,  ili bolshe 999 ili delitsa na 2"
    }
    println(number)
}



fun qwer(){
    val num = 400
    val c = when{
        num % 4 == 0 && num % 100 !=0 && num % 400 == 0 -> "366"
         else ->"365"

         }
        println(c)
    }

fun qwert(){
    val n = 1
    val a = 15.0
    val b = 25.0
    val c = when (n){
         1 -> a + b
         2 -> a - b
         3 -> a * b
         4 -> a / b

        else -> "shto ti vvel!?"

    }
println("$c")
}



fun qa(){
    val s = "sever"
    val z = "zapad"
    val v = "vostok"
    val y = "yug"
    val nap = y

    val n = 1
    val komanda = when{
        n == 0 -> "prodolzhat dvizh"
        n == 1 -> "povorot na levo"
        n == -1 -> "povorot na pravo"
        else -> "invalid komanda"

    }
    val napravlenie = when(nap){
        s -> "sever"
        z -> "zapad"
        v -> "vostok"
        y -> "yug"

        else ->"invalid napravleneie"
    }

    println(komanda)
    println(napravlenie)

}




fun qaz(){
    val pik = 1
    val tref = 2
    val bub = 3
    val cher = 4
    


}

