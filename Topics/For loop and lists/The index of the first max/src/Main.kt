fun main() {
    // write your code here
    val lsInd = readln().toInt()
    val numLs: MutableList<Int> = mutableListOf()

    repeat(lsInd) {
        numLs += readln().toInt()
    }
    val highest = numLs.maxOf {it}
    println(numLs.indexOf(highest))
}