
val high = DangerLevel.HIGH
val medium = DangerLevel.MEDIUM

enum class DangerLevel(val nums: Int) {

    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return nums
    }
}
fun main() {



    println(high.getLevel() > medium.getLevel()) // true
}
