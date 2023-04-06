fun main() {
    // write your code here
    val numCount = readln().toInt()
    var numLst: String= ""
    repeat(numCount) {
        numLst += readln()
    }

    val  pmLst = readln().split(' ')
    val pm = pmLst.first() + pmLst.last()
    val mp = pmLst.last() + pmLst.first()
    if (numLst.contains(pm) || numLst.contains(mp)) {
        println("NO")
    } else println("YES")
}