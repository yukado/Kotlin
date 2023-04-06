class City(val name: String ) {
    var degrees: Int = 5
}
fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()

    val firstCity = City("Dubai")
    val secondCity = City("Moscow")
    val thirdCity = City("Hanoi")

    if (first in -92 ..57 ) {
    firstCity.degrees = first
    } else firstCity.degrees = 30

    if (second in -92 ..57 ) {
        secondCity.degrees = second
    } else secondCity.degrees = 5

    if (third in -92 ..57 ) {
        thirdCity.degrees = third
    } else thirdCity.degrees = 20



    //implement comparing here


        when(minOf(minOf(firstCity.degrees, secondCity.degrees), thirdCity.degrees)) {
            first -> { if(firstCity.degrees != secondCity.degrees && firstCity.degrees != thirdCity.degrees) println(firstCity.name) else println("neither") }
            second -> { if(secondCity.degrees != firstCity.degrees && secondCity.degrees != thirdCity.degrees) println(secondCity.name) else println("neither") }
            third -> { if(thirdCity.degrees != secondCity.degrees && thirdCity.degrees != firstCity.degrees) println(thirdCity.name) else println("neither") }
            else -> println("Moscow")
        }

}