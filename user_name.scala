/*
1. User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P -> Take User Name as Input. Ensure UserName has min 3 char
b. Logic -> Replace <<UserName>> with the proper name
c. O/P -> Print the String with User Name
 */
import java.util.Scanner
object user_name {
  def main(args : Array[String]): Unit =
  {
    var flag: Boolean = true
    while(flag) {
      println("Enter your name : ")
      val name = scala.io.StdIn.readLine()
      if (name.length > 3) {
        print("Hello " + name)
        flag = false
      } else {
        print("please enter username more than 3 letter.")
      }
    }
  }
}
