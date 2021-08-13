
/* Implement basic calculator in Scala */

object Calculator {

    def add(n1: Float, n2: Float) : Float = {
        return n1 + n2
    }

    def subtract(n1: Float, n2: Float) : Float = {
        return n1 - n2
    }

    def product(n1: Float, n2: Float) : Float = {
        return n1 * n2
    }

    def divide(n1: Float, n2: Float) : Float = {
        return n1 / n2
    }

    def main(args: Array[String]) : Unit = {
        println("\nWelcome to Scala Calculator\n")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide\n")
        val choice: Int = scala.io.StdIn.readLine("Choose: ").toInt
        val a: Float = scala.io.StdIn.readLine("\nEnter 1st number: ").toFloat
        val b: Float = scala.io.StdIn.readLine("Enter 2st number: ").toFloat

        if (choice == 1){
            println("Sum of the given numbers is: " + add(a, b))
        } else if (choice == 2) {
            println("Difference of the given numbers is: " + subtract(a, b))
        } else if (choice == 3){
            println("Product of the given numbers is: " + product(a, b))
        } else if (choice == 4){
            if (b != 0){
                println("Sum of the given numbers is: " + divide(a, b))
            } else {
                println("Division by Zero not possible!")
            }
        } else {
            println("Oops! Invalid Option")
        }

    }
}
