fun main() {
    // put your code here
    val wordStr = readln()
    val firstCh = wordStr.first()
    val secondCh = wordStr.last()
    val wordStr1 = wordStr.replace(wordStr.last(), firstCh)
    val wordStr2 = wordStr1.replaceFirst(wordStr1.first(), secondCh)

    println(wordStr2)
}