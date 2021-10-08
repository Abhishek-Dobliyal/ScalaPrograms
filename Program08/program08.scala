/*

Create a Scala Application, which would include different user-defined functions for given tasks:

Task1: Compare two Strings: 1-"ABC", 2-"ABC"
Task2: Convert a upper case string to lower case string
Task3: Find the index of a char in a string
Task4: Find the index of a sub string in a string
Task5: Create a char array and store it into a string

*/


object Program8 {

    def compare(a: String, b: String) : Unit = {
        if (a.compareTo(b) == 0) {
            println(s"${a} and ${b} are equal!")
        } else {
            println(s"${a} and ${b} are not equal!")
        }
        println()
    }

    def convertToLowercase(str: String) : Unit = {
        println(s"${str} in Lowercase: " + str.toLowerCase())
        println()
    }

    def getIndex(str: String, char: Char) : Unit = {
        var idx: Int = str.indexOf(char)
        println(s"${char} is present at index ${idx}")
        println()
    }

    def getIndexSubstring(str: String, subs: String) : Unit = {
        var idx: Int = str.indexOf(subs)
        println(s"${subs} in ${str} starts at index ${idx}")
        println()
    }

    def charArrayToString(charArray: Array[Char]) : String = {
        var res: String = ""
        for (i <- charArray) {
            res += i
        }
        return res
    }

    def main(args: Array[String]) : Unit = {

        var a: String = scala.io.StdIn.readLine("\nEnter first string: ")
        var b: String = scala.io.StdIn.readLine("Enter second string: ")

        compare(a, b)
        convertToLowercase(a)

        print("Enter a character to be searched in second string: ")
        var c: Char = scala.io.StdIn.readChar()
        getIndex(b, c)

        var d: String = scala.io.StdIn.readLine("Enter substring to search in first string: ")
        getIndexSubstring(a, d)

        var charArr: Array[Char] = Array('a', 'b', 'h', 'i', 's', 'h', 'e', 'k')
        var e: String = charArrayToString(charArr)
        println("The given character array to string: " + e)

    }
}
