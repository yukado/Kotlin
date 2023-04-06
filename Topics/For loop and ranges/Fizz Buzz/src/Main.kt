fun main() {
    // put your code here
    val firstNum = readln().toInt()
    val secondNum = readln().toInt()
    fun fizBuzz(x: Int) {
        if (x % 3 == 0 && x % 5 == 0) println("FizzBuzz") else println(x)
    }

    for (i in firstNum .. secondNum) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")

        } else if (i % 3 == 0) println("Fizz") else if (i % 5 == 0) println("Buzz")
        else println(i)

        }
}