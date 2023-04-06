fun main() {
    // write your code here
    val strIn = readln()
    var result: String = ""
    for (ch in strIn) {
        result += ch
        result += ch
    }
    print(result)
}