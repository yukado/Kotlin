fun main() {
    // put your code here
    var input = readln().lowercase()
    val alfabet = mutableListOf<String>("a","b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                                        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    for (ch in input) {
        alfabet.remove(ch.toString())
    }
    input = alfabet.joinToString("")
    println(input)
}