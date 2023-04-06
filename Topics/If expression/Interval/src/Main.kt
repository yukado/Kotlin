fun main() {
    // write your code here
    val eingabe = readln().toInt()
    if (eingabe > -15 && eingabe <= 12) {
        println("True")
    } else
    if (eingabe > 14 && eingabe < 17) {
        println("True")
    } else
    if (eingabe >= 19) {
        println("True")
    }else {
        println("False")
    }
}
