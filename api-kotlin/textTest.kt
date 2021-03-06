// kotlinc textTest.kt -include-runtime -d textTest.jar
// java -jar textTest.jar

/**
 *  Sum list 
 */
fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3, 4).sum()
    println(sum)    // 10
}


/**
 * Infix function
 */
//  fun main(args: Array<String>) {
//      val h1 = Header("H1")
//      val h2 = Header("H2")

//      val h3 = h1 plus h2
//      println(h3.Name)

//      val h4 = h1 + h2
//      println(h4.Name)
//  }

//  class Header(var Name: String) {}

//  operator infix fun Header.plus(other: Header) : Header {
//      return Header(this.Name + other.Name)
//  }

/**
*  Call a function.
*  Check if arguments given.
*/
// fun main(args: Array<String>) {
//     var message: String = if (args.size != 0) { args[0] } else { "Hello Olli!" }
//     display(message)
// }
// fun display(message: String) : Boolean{
//     println(message)
//     return true
// }

/**
*  Iterate over TreeMap
*/
// fun main(args: Array<String>) {
//     // error: unresolved reference: TreeMap
//     var ages = TreeMap<String, Int>()

//     ages["Kevin"] = 55
//     ages["Liz"] = 70
//     ages["Harry"] = 34
//     ages["Alex"] = 17

//     for((name, age) in ages) {
//         println("$name is $age years old.")
//     }
// } 


/**
*  joinToString
*/
// fun main() {
// println(listOf('a', 'b', 'c').joinToString(
//     separator = "", prefix = "(", postfix = ")"))
// } 


/**
*  return letter charcode+1
*/
// fun main() {
//   for (ch in "abc") {
//     print(ch + 1) 
//   }
// }


/**
*  Is string valid as an identifier?
*/
// fun isValidIdentifier(s: String): Boolean {
//   fun isValidCharacter(ch: Char) =
//       ch == '_' || ch in '0'..'9' ||
//       ch in 'a'..'z' || ch in 'A'..'Z'

//   if (s.isEmpty() || s[0] in '0'..'9') return false
//   for (ch in s) {
//       if (!isValidCharacter(ch)) return false
//   }
//   return true
// }

// fun main(args: Array<String>) {
//     println(isValidIdentifier("name"))   // true
//     println(isValidIdentifier("_name"))  // true
//     println(isValidIdentifier("_12"))    // true
//     println(isValidIdentifier(""))       // false
//     println(isValidIdentifier("012"))    // false
//     println(isValidIdentifier("no$"))    // false
// }