enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar");
}
fun main() {
    // put your code here
    val (country1, country2) = readln().uppercase().split(' ')

    fun isCountry1(state1: String): Boolean {
        for (enum in Country.values()) {
            if (state1 == enum.name)
                return true
        }
        return false
    }
    fun isCountry2(state2: String): Boolean {
        for (enum in Country.values()) {
            if (state2 == enum.name)
                return true
        }
        return false
    }
    fun compCurr(state1: String, state2: String): Boolean {
        val currency1 = Country.valueOf(country1).currency
        val currency2 = Country.valueOf(country2).currency
        if (currency1 == currency2) {
            return true
        }
        return false
    }
    if (isCountry1(country1) && isCountry2(country2)) {
        println(compCurr(country1, country2))
    } else println(false)
}