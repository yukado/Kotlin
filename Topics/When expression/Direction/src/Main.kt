fun main() {
    // write your code here
    when(val eingabe = readln().toInt()) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("move right")
        0 -> println("do not move")
        else -> println("error!")
    }
}