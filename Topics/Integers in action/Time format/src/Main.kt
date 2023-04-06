fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val day: Int = (totalSeconds % (3600 * 24)).toInt()
    val hours: Int = day / 3600
    val minutes: Int = day / 24 % 60
    val seconds: Int = day / 24 / 60 % 60

    println("$hours:$minutes:$seconds")
}