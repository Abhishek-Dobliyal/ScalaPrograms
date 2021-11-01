/*

Create a Scala Application, which would include different user-defined functions for given tasks:
Task 1- WAP to Initialize a list in all possible ways [at least 2]?
Task 2- WAP to Print list elements?
Task 3- WAP to find head, tail and check if list is empty or not?
Task 4- WAP in Scala which would add two list by using:
         a) ":::" operator [fruit1 ::: fruit2]
         b) ".:::" operator [fruit1 .::: (fruit2)] [fruits 2 would come before fruits1]
         c) List.concat(L1,L2)
Task 5- WAP to create a uniform list in Scala
Task 6- WAP to add two lists, ununiform and uniform lists

*/

object Program10 {

    def task1() : Unit = {
        val l1: List[Int] = List(1, 2, 3)
        val l2: List[String] = "Python"::"Scala"::"Javascript"::Nil
        println(l1, l2)
        println()
    }

    def task2(l: List[Int]) : Unit = {
        println(l) // Directly print a list
        for (ele <- l) {
            print(ele, "->")
        }
        println()
    }

    def task3(l: List[String]) : Unit = {
        println("Given List: ", l)
        println(s"Head: ${l.head}")
        println(s"Tail: ${l.tail}")
        println(s"Is Empty: ${l.isEmpty}")
        println()
    }

    def task4(l1: List[Int], l2: List[Int]) : Unit = {
        println("List 1: ", l1)
        println("List 2: ", l2)

        println("Using concat(): ", List.concat(l1, l2))
        println("Using ::: ", l1 ::: l2)
        println("Using .::: ", l1.:::(l2))
        println()
    }

    def task5() : Unit = {
        val l: List[Int] = List.fill(3)(5)
        println("Uniform List is: ", l)
        println()
    }

    def task6(uniform: List[Int], nonUniform: List[Int]) : Unit = {
        println("L1 + L2: ", uniform ::: nonUniform)
        println()
    }

    def main(args: Array[String]) : Unit = {
        val strList: List[String] = List("Python", "JS", "Scala")
        val intList1: List[Int] = List(1, 3, 4, 5)
        val intList2: List[Int] = List(10, 3, 44, 25)

        task1()
        task2(intList1)
        task3(strList)
        task4(intList1, intList2)
        task5()
        task6(intList1, intList2)
    }
}
