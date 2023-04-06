fun main() {
    val input = readLine()!!
    // write code here
    var eingabe = input
if (eingabe.isEmpty()) {
    println()
} else {
    when (eingabe.first()) {
        'i' -> {
            eingabe = eingabe.drop(1)
            println(eingabe.toInt() + 1)
        }
        's' -> {
            eingabe = eingabe.drop(1)
            println(eingabe.reversed())
        }
        ' ' -> println(" ")
        else -> {

            println("$eingabe")

        }
    }
}
}