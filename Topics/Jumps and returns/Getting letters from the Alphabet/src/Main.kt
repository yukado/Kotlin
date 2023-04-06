fun main() {
    // put your code here
    val inChr = readln()
    var chrLstAsLst = ""
    var chrLst = "abcdefghijklmnopqrstuvwxyz"
    val inChrInd = chrLst.indexOf(inChr)
    chrLst = chrLst.removeRange(inChrInd, chrLst.lastIndex)
    chrLst.replace(chrLst.last(), ' ')
    for (i in 0 until chrLst.lastIndex) {
            chrLstAsLst += chrLst[i]
    }

    println(chrLstAsLst)
}