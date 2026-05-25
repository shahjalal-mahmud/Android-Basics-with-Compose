fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(compare(timeSpentToday, timeSpentYesterday))
}

fun compare(num1: Int, num2: Int) : Boolean {
    return num1 > num2
}