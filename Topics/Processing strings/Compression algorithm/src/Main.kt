fun main() {
    // write your code here
    fun isOnlyLetters(word: String): Boolean {
        val regex = "^[A-Za-z]*$".toRegex()
        return regex.matches(word)}

    val inStr = readln()
    var chStr = inStr.first().toString()
    if (inStr.isNotEmpty() && isOnlyLetters(inStr)) {


        var counTer = 1
        val intLst = mutableListOf<Int>()
        if (inStr.length > 1) {
            for (i in 1..inStr.lastIndex) {
                if (inStr[i] == inStr[i - 1]) {
                    counTer += 1
                } else if (inStr[i] != inStr[i - 1]) {
                    chStr += counTer
                    chStr += inStr[i]
                    intLst.add(counTer)
                    counTer = 1
                }
                if (i == inStr.lastIndex) {
                    chStr += counTer
                    intLst.add(counTer)
                }
            }
            println(chStr)
        } else {
            chStr += "1"
            println(chStr)
        }
    } else {

    }
}