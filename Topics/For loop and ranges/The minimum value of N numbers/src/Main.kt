import kotlin.math.max

fun main() {
    // write your code here
    val countOfNs = readln().toInt()
    var numbres = mutableListOf<Int>()
    repeat(countOfNs){
        numbres.add(readln().toInt())
    }
    println(numbres.minOf { it })
}