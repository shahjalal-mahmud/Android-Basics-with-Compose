fun main() {
    display("Ankara", 27, 31, 82)
    display("Tokyo", 32, 36, 10)
    display("Cape Town", 59, 64, 2)
    display("Guatemala City", 50, 55, 7)
}

fun display(city: String, lt: Int, ht: Int, rain: Int) : Unit {
    println("City: $city \nLow temperature: $lt, High temperature: $ht \nChance of rain: $rain%\n")
}