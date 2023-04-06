fun main() {
    // put your code here
    val eingabe = readln().toInt()
    if (eingabe % 2 == 0) {
        println("Divided by 2")
    }
    if (eingabe % 3 == 0) {
        println("Divided by 3")
    }
    if (eingabe % 5 == 0) {
        println("Divided by 5")
    }
    if (eingabe % 6 == 0) {
        println("Divided by 6")
    }
}