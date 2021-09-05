
/*
Create a Scala Application, which would create different user-defined functions for given tasks:

    Pass two values and apply all Arithmetic operations on these values
    Pass two values and apply all Relational operations on these values
    Pass two values and apply all Logical operations on these values
    Pass two values and apply all Bitwise operations on these values
    Pass two values and apply all Assignment operations on these values
*/

object Program5 {

    def arithmetic(a: Int, b: Int) : Unit = {
        println("\nArithmetic Operators Demo:\n")
        println("Sum of given values: " + (a + b))
        println("Difference of given values: " + (a - b))
        println("Product of given values: " + (a * b))
        println("Division of given values: " + (a / b))
        println("Modulus of given values: " + (a % b))
    }

    def relational(a: Int, b: Int) : Unit = {
        println("\nRelational Operators Demo:\n")
        println("Not equal to of given values: " + (a != b))
        println("Greater than of given values: " + (a > b))
        println("Lesser than of given values: " + (a < b))
        println("Greater than or equal to of given values: " + (a >= b))
        println("Lesser than or equal to of given values: " + (a <= b))
    }

    def logical(a: Boolean, b: Boolean) : Unit = {
        println("\nLogical Operators Demo:\n")
        println("Logical AND of given values: " + (a && b))
        println("Logical OR of given values: " + (a || b))
        println("Logical NOT of given values: " + !(a || b))
    }

    def bitwise(a: Int, b: Int) : Unit = {
        println("\nBitwise Operators Demo:\n")
        println("Bitwise AND of given values: " + (a & b))
        println("Bitwise OR of given values: " + (a | b))
        println("Bitwise XOR of given values: " + (a ^ b))
        println("Bitwise LEFT SHIFT of given values: " + (a << b))
        println("Bitwise RIGHT SHIFT of given values: " + (a >> b))
        println("Bitwise SHIFT RIGHT of given values: " + (a >> b))
        println("Bitwise 1's Compliment of a: " + ~a)
    }

    def assignment(a: Int, b: Int) : Unit = {
        println("\nAssignment Operators Demo:\n")

        var c: Int = a + b
        println("Value of c: " + c)
        c += a
        println("Add and Assign to: " + c)

        c -= a
        println("Subtract and Assign to c: " + c)

        c *= a
        println("Multiply and Assign to c: " + c)

        c /= a
        println("Divide and Assign to c: " + c)

        c %= a
        println("Modulo and Assign to c: " + c)

        c >>= a
        println("RIGHT SHIFT and Assign to c: " + c)

        c <<= a
        println("LEFT SHIFT and Assign to c: " + c)

        c ^= a
        println("XOR and Assign to c: " + c)

        c &= a
        println("Bitwise AND and Assign to c: " + c)

        c |= a
        println("Bitwise OR and Assign to c: " + c)
    }


    def main(args: Array[String]) : Unit = {
        println("===================== Operators Demo ========================")
        var a: Int = 10
        var b: Int = 20

        var bool_a: Boolean = true
        var bool_b: Boolean = false

        arithmetic(a, b)
        relational(a, b)
        logical(bool_a, bool_b)
        bitwise(a, b)

    }
}
