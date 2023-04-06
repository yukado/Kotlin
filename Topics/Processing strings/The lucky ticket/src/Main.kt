fun main() {
    // write your code here
    val tNum = readln()
    var firstSum = tNum.first().toString().toInt() + tNum[tNum.lastIndex - 3].toString().toInt() + tNum[tNum.lastIndex -4].toString().toInt()
    var lastSum = tNum.last().toString().toInt() + tNum[tNum.lastIndex -1].toString().toInt() + tNum[tNum.lastIndex - 2].toString().toInt()
    if (firstSum == lastSum) println("Lucky") else println("Regular")
}