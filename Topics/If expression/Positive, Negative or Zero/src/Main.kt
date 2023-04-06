fun main() {
    // write your code here
    when(val eingabe = readln().toInt()) {
        0 -> println("zero")
        else -> if (eingabe > 0) {
            println("positive")
        } else if (eingabe < 0) {
            println("negative")
        }
    }
}