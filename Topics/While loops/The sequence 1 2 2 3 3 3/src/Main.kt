fun main() {
    var n = readln().toInt()

    var i = 1
    do {
        var j = i
        do {
            print("$i ")
            j--
            n--
        } while (j != 0 && n != 0)
        i++
    } while (n != 0)
}