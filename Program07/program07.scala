/*

Create a Scala Application, which would include different user-defined functions for given tasks:

Q1. Write a function in Scala that takes two numbers as parameters and returns the Maximum
    and Minimum of them. (Use Single Nested Function)

Q2. Write a function in Scala that takes two numbers as parameters and returns
    the Maximum and Minimum of them. (Use Multi Nested Function)

Q3. Explain in your recording what is Entry control and exit control Loop in Scala

Q4. Write a Scala Program which would use Break and Continue features to check
    if an entered number is equal to 3 or not?

Q5. Write a two loop function using nested loops to achieve smallest element in a array in Scala

*/

import scala.util.control.Breaks._

object Program7 {

    def getMinMaxSingleNested(a: Int, b: Int) = {

        def getMin(): Int = {
            if (a < b) {
                return a
            } else {
                return b
            }
        }

        def getMax(): Int = {
            if (a < b) {
                return b
            } else {
                return a
            }
        }

        var min: Int = getMin()
        var max: Int = getMax()
        (min, max)
    }

    def getMinMaxMultiNested(a: Int, b: Int) = {
        var min = 0
        var max = 0
        def nested() = {
            if (a < b){
                min = a
                def getMax(): Int = {
                    return b
                }
                max = getMax()
            } else {
                min = b
                def getMax(): Int = {
                    return a
                }
                max = getMax()
            }
        }
        nested()
        (min, max)
    }

    def entryControlled() : Unit = {
        println("While loop is an example of entry controlled loop:")
        var i = 0
        while (i < 0) {
            println(s"Value of i: $i")
            i += 1
        }
        println("This won't even run once as the condition is not satisfied!\n")
    }

    def exitControlled() : Unit = {
        println("Do-While loop is an example of entry controlled loop:")
        var i = 0
        do {
            println(s"Value of i: $i")
            i += 1
        } while (i < 0)

        println("This runs once.\n")
    }

    def checkNum() : Unit = {
        breakable {
            println("Break Demonstartion\n")
            for (i <- 1 to 10){
                if (i == 3){
                    println("Found 3")
                    break()
                }
                println(s"Current value is: $i")
            }
        }

        println("Continue Demonstration\n")
        for (i <- 1 to 10){
            breakable {
                if (i == 3){
                    println("Found 3")
                    break()
                }
                println(s"Current value is: $i")
            }
        }
    }

    def getSmallestInArray(arr: Array[Int]) : Int = {
        var min = 999
        for (i <- 0 to arr.length-1) {
            if (min > arr(i)) {
                min = arr(i)
            }
            for (j <- i+1 to arr.length-1) {
                if (min > arr(j)) {
                    min = arr(j)
                }
            }
        }
        return min
    }

    def main(args: Array[String]) : Unit = {
        var (x1, y1) = getMinMaxSingleNested(10, 20)
        println(s"\nSolved using single nested => Min: $x1 Max: $y1")
        var (x2, y2) = getMinMaxMultiNested(10, 20)
        println(s"\nSolved using multi nested => Min: $x2 Max: $y2")

        entryControlled()
        exitControlled()
        checkNum()

        var array = Array(10, 5, 10, -1, 67, 22)
        println(s"\nSmallest element in the given array is: ${getSmallestInArray(array)}")
    }
}
