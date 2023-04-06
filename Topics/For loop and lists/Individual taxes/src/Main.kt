fun main() {
    // write your code here
    val compNum = readln().toInt()
    val compIncomeLst: MutableList<Int> = mutableListOf()
    val compTaxLst: MutableList<Int> = mutableListOf()
    val taxLst: MutableList<Double> = mutableListOf()
    repeat(compNum) {
        compIncomeLst += readln().toInt()
    }
    repeat(compNum) {
        compTaxLst += readln().toInt()
    }
    for (i in 0 until compIncomeLst.size) {
        taxLst += (compIncomeLst[i].toDouble() / 100 ) * compTaxLst[i].toDouble()
    }

    println(taxLst.indexOf(taxLst.maxOf { it }) + 1)
}