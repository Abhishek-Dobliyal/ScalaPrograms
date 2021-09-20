/*

Create a Scala Application, which would include different user-defined functions for given tasks:
Q1. Write a Scala program that reads a number(dynamic) and display its
square, cube, and fourth power.

Q2. Write a Scala program to check the given number is a prime number or not. (Number can be static or dynamic).

Q3. Create Student object with the main method. The variable studmarks is initialized with a value of 75.
    In the if block, if the marks is greater than 65 then the marks is incremented by 20 and the statement “student passed the exam with distinction” is printed.
    Since the marks is initialized to 75 which is greater than 65 the if loop statements are executed.

*/

class Student(studentMarks: Int) {
    var marks: Int = studentMarks
}

object Program6 {
    def power(x: Double) : Unit = {
        for (i <- 2 to 4) {
            var res: Double = x
            for (j <- 2 to i) {
                res *= x
            }

            println(s"$x to power $i is: $res")
        }
    }

    def isPrime(num: Int) : Boolean = {
        if (num < 2) {
            return false
        }

        var end: Int = scala.math.sqrt(num).toInt
        for (i <- 2 to end) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    def main(args: Array[String]) : Unit = {

        // Calculate 2nd, 3rd and 4th power of a number
        print("\nEnter a number: ")
        var x: Double = scala.io.StdIn.readDouble()
        power(x)

        // Check whether number is prime or not
        print("\nEnter a number to check it's primality: ")
        var num: Int = scala.io.StdIn.readInt()
         if (isPrime(num)) {
            println(s"$num is Prime")
        } else {
            println(s"$num is not Prime")
        }

        // Student marks
        var studentMarks: Int = 75
        var studentObj: Student = new Student(studentMarks)

        if (studentObj.marks > 65) {
            studentObj.marks += 20
            println(s"\nStudent passed the exam with distinction. Final marks ${studentObj.marks}")
        }
    }
}
