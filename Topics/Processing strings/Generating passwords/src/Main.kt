fun main() {
    // write your code here
    fun printSortedNumbers(a: Int, b: Int, c: Int, asc: Boolean = false, abs: Boolean = false) {
        var newStr = ""
        newStr += a
        newStr += b
        newStr += c
        println(newStr, false,true)
    }
    printSortedNumbers(-2, 3, 1)

}