fun main() {
    // put your code here

        val hours1 = readln().toUInt()
        val minutes1 = readln().toUInt()
        val seconds1 = readln().toUInt()

    val hours2 = readln().toUInt()
    val minutes2 = readln().toUInt()
    val seconds2 = readln().toUInt()
    val sum2 = (hours2.toInt() * 3600) + (minutes2.toInt() * 60) + seconds2.toInt()
    val sum1 = (hours1.toInt() * 3600) + (minutes1.toInt() * 60) + seconds1.toInt()
    if (sum1 < sum2 || sum1 === sum2){
        println(sum2 -sum1)
    } else
  println(sum1 - sum2)
}