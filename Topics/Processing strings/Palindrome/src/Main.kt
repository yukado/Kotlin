fun main() {
    // write your code here
    val inWord = readln().lowercase()
    val inWordReverse = inWord.reversed()
    if (inWord == inWordReverse) {
        println("yes")
    } else println("no")
}