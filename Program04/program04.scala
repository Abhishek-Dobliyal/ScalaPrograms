/*

Q1. Demonstrate read line function using Scala.

Q2. Write a function to add two numbers using mutable and immutable values

Q3. Write a program which would demonstrate the use of Access Modifiers
        - Private
        - Public
        - Protected

*/
class Parent {
    private var pvt: Int = 25
    protected var protect: Int = 15
    var public: Int = 65

    def display_private() : Unit = {
        println("\nDisplaying private variable of Parent class: " + pvt)
    }

    def display_protected() : Unit = {
        println("\nDisplaying protected variable of Parent class: " + protect)
    }
}

class Child extends Parent {

    def display_parent_protected() : Unit = {
        println("\nDisplaying protected variable of Parent class in Child class: " + protect)
        protect = 2
        println("Displaying protected variable of Parent class in Child class after modification: " + protect)
    }
}

object Program4 {

    def readline(msg: String) : String = {
        var s : String = scala.io.StdIn.readLine(msg)
        return s
    }

    def add_mutable(a: Int, b: Int) : Int = {
        return a + b
    }

    def add_immutable(p: Int, q: Int) : Int = {
        return p + q
    }

    def main(args: Array[String]) : Unit = {
        // Demo Readline
        val a: Int = readline("\nEnter 1st number (Immutable): ").toInt
        val b: Int = readline("Enter 2st number (Immutable): ").toInt

        var x: Int = readline("\nEnter 1st number (Mutable): ").toInt
        var y: Int = readline("Enter 2st number (Mutable): ").toInt

        // Add two nums using mutable and immutable values
        var mutable_sum: Int = add_mutable(a, b)
        val immutable_sum: Int = add_immutable(x, y)

        println("\nMutable Sum: " + mutable_sum)
        mutable_sum += 20
        println("Mutable sum after adding 20: " + mutable_sum)

        println("\nImmutable Sum: " + immutable_sum)
        immutable_sum = 20 //  This will throw error [error: reassignment to val]
        println("Immutable sum after adding 20: " + immutable_sum)

        // Access Modifiers
        var parent = new Parent()
        println("\nPublic variable of parent class can be accessed from anywhere. It's value is: " + parent.public)
        parent.display_private()
        parent.display_protected()

        var child = new Child()
        child.display_parent_protected()
    }

}
