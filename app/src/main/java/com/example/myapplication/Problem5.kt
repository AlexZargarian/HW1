fun main() {

    print("Please enter your name: ")
    val name = readLine()


    print("Please enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (name != null && age != null) {

        println("Hi $name, you are $age years old.")
    } else {

        println("Invalid input. Please enter a valid name and age.")
    }
}
