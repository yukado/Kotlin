const val EQUALS = "equals"
const val PLUS = "plus"
const val ENDS_WITH = "endsWith"

fun main() {
    val valueOne = readLine()!!
    val operator = readLine()!!
    val valueTwo = readLine()!!
    print(processString(valueOne, operator, valueTwo))
}
private fun processString(valueOne: String, operator: String, valueTwo: String) = when (operator) {
    EQUALS -> valueOne == valueTwo
    PLUS -> valueOne + valueTwo
    ENDS_WITH -> valueOne.endsWith(valueTwo)
    else -> "Unknown operation"
}
