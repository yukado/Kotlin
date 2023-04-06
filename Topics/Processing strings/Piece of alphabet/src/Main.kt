fun main() {
    // write your code here
    val inStr = readln().lowercase()
    val alphabetStr = "abcdefghijklmnopqrstuvwxyz"
    if (alphabetStr.contains(inStr)) println("true") else println("false")
}