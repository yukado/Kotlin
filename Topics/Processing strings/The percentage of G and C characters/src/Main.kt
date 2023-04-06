fun main() {
    // write your code here
    val fullSequence = readln().lowercase()

    var gcInSequence: Int = 0
    for (ch in fullSequence) {
        if (ch == 'g' || ch == 'c')
        gcInSequence += 1
    }
    val perCentage: Double = (gcInSequence.toDouble() / fullSequence.length.toDouble()) * 100
    println(perCentage)
}