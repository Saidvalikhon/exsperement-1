import rectPS as rectPS1

fun rectPS(x1: Int, y1: Int, x2: Int, y2: Int):Int {
    val len = (x2 - x1)
    val wid = (y2 - y1)

    val p = 2 * (len + wid)
    val s = len * wid
    return s
}


fun main(){
}