fun main() {
    // put your code here
    var resultStr = ""
    val fullStr = readln()
    val name = fullStr.split(' ').first()
    resultStr += name[0] + ". "

    val lastName = fullStr.split(' ')[1]
    resultStr += "$lastName, "
    val age = fullStr.split(' ').last()
    resultStr += "$age years old"
    println(resultStr)

}