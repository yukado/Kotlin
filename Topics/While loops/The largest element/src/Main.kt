import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    do {
        val value = scanner.nextInt()
        if(value > max) {
            max = value
        }
    }while (value != 0)
    println(max)
}