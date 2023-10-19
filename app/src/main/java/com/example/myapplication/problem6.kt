fun divideNumbers(numerator: Double, denominator: Double): Any {
    return if (denominator != 0.0) {
        val result = numerator / denominator
  return (result)
    } else {
        "Error: Division by zero is not allowed."
    }
}

fun main() {

    print("Enter the numerator: ")
    val numerator = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter the denominator: ")
    val denominator = readLine()?.toDoubleOrNull() ?: 1.0


    val result = divideNumbers(numerator, denominator)
    println(result)
}
