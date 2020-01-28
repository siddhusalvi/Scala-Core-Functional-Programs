/*
4. Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */

object square_of_number {
  def main(args:Array[String]):Unit ={
    println("Enter a number between 0 and 31 : ")
    var flag = true
    while(flag) {
      val num = scala.io.StdIn.readInt()
      if(num < 31 && num >= 0 )
        {
          var answer = 1
          println("2^0 : "+answer)
          for(i <- 1 to num){
            answer = answer * 2
            println("2^"+i+" : "+answer)
          }
          flag = false
        }
        else
        {
          println("Please enter a valid number.")
        }
    }

  }
}
