fun main() {
    // write your code here
    val inWord=readln().toMutableList()
    val  voWels="aeiouy"
    val conSonants="bcdfghjklmnpqrtsvwxz"
    var charNeeded=0
    for (i in 2 .. inWord.lastIndex) {
        if (voWels.contains(inWord[i]) && voWels.contains(inWord[i - 1]) && voWels.contains(inWord[i - 2])) {
            inWord[i - 1]='!'
        } else if (conSonants.contains(inWord[i]) && conSonants.contains(inWord[i - 1]) && conSonants.contains(inWord[i - 2])) {
            inWord[i - 1]='!'
        }
    }
    val outWord=inWord.joinToString(",")
    for (i in 0 .. outWord.lastIndex) {
        if (outWord[i]=='!') {
            charNeeded += 1
        }
    }
    println(charNeeded)
}
