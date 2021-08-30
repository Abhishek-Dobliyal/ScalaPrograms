/* Demonstrate different datatypes in Scala:

1. Byte
2. Short
3. Int
4. Long
5. Float
6. Double
7. Char
8. String
9. Boolean
10. Unit
11. null
12. Null
13. Nothing
14. Any
15. AnyRef

 */

object Program3 {

    def demoUnit(a : Int, b : Int) : Unit = {
        println("\nThis is a method with Unit return type. It is similar to void")
        print("Sum of two params is: " + (a + b))
    }

    def demoNothing(message : String) : Nothing = {
        println("\nYour Message: " + message)
        println("Demonstarting Nothing datatype. Some type of return type a function should have. It is a subtype of all datatypes.")
        throw new Exception("Nothing Return Type")
    }

    def demoAny(x : Any) = println("\nThe value of Any type parameter is: " + x)
    def demoRef(x : AnyRef) = println("\nThe value of AnyRef type parameter is: " + x)
    def demoVal(x : AnyVal) = println("\nThe value AnyVal type parameter is: " + x)

    def main(args: Array[String]) : Unit = {
        println("\nScala Lab Program 03")

        val byte : Byte = 10
        println("\nByte datatype can store 8 bit signed value such as: " + byte)

        val short : Short = 1000
        println("\nShort datatype can store values of range lesses than Integer such as: " + short)

        val int : Int = 10000001
        println("\nInt datatype can 32 bit signed values such as: " + int)

        val long : Long = 1000000002
        println("\nLong datatype can store 64 bit signed value such as: " + long)

        val float : Float = 1.23.asInstanceOf[Float]
        println("\nFloat datatype can store 32 bit IEEE 754 single-precision float value such as: " + float)

        val double : Double = 10.9993299329
        println("\nDouble datatype can store 64 bit IEEE 754 double-precision float value such as: " + double)

        val char : Char = 'A'
        println("\nChar datatype can only store a 16-bits unsigned single character at a time such as: " + char)

        val string : String = "Hello World"
        println("\nString datatype can store sequence of Char type value such as: " + string)

        val bool : Boolean = true
        println("\nBoolean stores either true or false")

        demoUnit(10, 4) // Demonstrate Unit

        val nullRefVar : String = null
        println("\nnull has no reference, methods and no fields. It is an instance of trait Null")

        val traitNullRefVar : Null = null
        println("\nNull is also similar to null except it's a trait and cannot be extended or initiated.")

        /* Any

        Any is the super type of every other type:
        It is divided into two parts:

            1. AnyRef -> Every user defined type is a subtype of AnyRef
            2. AnyVal -> It represents values. All the primitive dattypes also come under AnyVal
        */
        demoAny("Hello")
        demoAny(nullRefVar)

        demoRef(traitNullRefVar)

        demoVal(23.52)
        demoVal('A')

        demoNothing("Exception") // Can have any return type
    }
}
