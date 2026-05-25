fun main() {
    val greeting = birthdayGreetings("Shahajalal", 22)
    println(greeting)
}

fun birthdayGreetings(name: String, age: Int) : String {
    val nameGreeting = "Happy Birthday, $name"
    val ageGreeting = "You are now $age years old."
    return "$nameGreeting\n$ageGreeting"
}