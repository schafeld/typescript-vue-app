// kotlinc helloMoon.kt -include-runtime -d helloMoon.jar
// java -jar helloMoon.jar Mars
// Hello, Mars!

package intro

fun main(args: Array<String>) {
  val name = if (args.size > 0) args[0] else "Pluto"
  println("Hello, $name!")
}