class Person(val name: String, val age: Int) {
    fun getLifeStage(): String {
        return when {
            age < 15 -> "Child"
            age in 15..19 -> "Teenager"
            age in 20..28 -> " Young Adult"
            age in 29..64 -> "Adult"
            else -> "Senior"
        }
    }
}

fun main() {
    // Create an object of the Person class
    val person = Person("Alex Zar", 27)


    println(person.name)
    println(person.age)


    val lifeStage = person.getLifeStage()
    println("Life Stage: $lifeStage")
}
