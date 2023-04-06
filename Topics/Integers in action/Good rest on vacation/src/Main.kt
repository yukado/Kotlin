fun main() {
    // put your code here
    val durationDays = readln().toInt()
    val foodCostDay = readln().toInt()
    val flightCost = readln().toInt() * 2
    val costNightHotel = readln().toInt()
    val totalCostOfVacation = (durationDays * foodCostDay) + flightCost + ((durationDays - 1) * costNightHotel)
    println(totalCostOfVacation)
}