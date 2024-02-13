import kotlin.math.pow

fun sumOfPowers(N: Int, K: Int): Double {
    var sum = 0.0
    for (i in 1..N) {
        sum += i.toDouble().pow(K)
    }
    return sum
}

fun main() {
    val N = 3
    val K = 2
    println(sumOfPowers(N, K))  // Выведет 14.0
}