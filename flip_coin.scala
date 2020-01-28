/*
2. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 */
import java.lang.Math
object flip_coin {
  def main(args : Array[String]) :Unit =
  {
    var flag : Boolean = true
    while(flag){
      println("Enter any positive number : ")
      var number = scala.io.StdIn.readInt()
      if(number > 0){
        var tailcounter = 0
        for(i <- 1 to number) {
          if (math.random() > 0.5) {
            tailcounter += 1
          }
        }

        val tail_per = tailcounter.toFloat / number.toFloat * 100
        val head_per = (1f -tailcounter.toFloat / number.toFloat) * 100

        println("Tail Percentages : "+tail_per)
        println("Head Percentages : "+head_per)
        flag = false
      }else{
        print("Enter valid input")
      }
    }
  }
}
