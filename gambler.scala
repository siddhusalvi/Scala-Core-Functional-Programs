import java.util.Scanner

/*
1. Gambler
a. Desc -> Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out.
b. I/P -> $Stake, $Goal and Number of times
c. Logic -> Play till the gambler is broke or has won
d. O/P -> Print Number of Wins and Percentage of Win and Loss
 */
object Gambler {
  def main(args: Array[String]): Unit = {
    var flag = true
    var win ,loss : Int = 0
    while(flag){

    try{
      print("\n Enter number of stakes : ")
      var stakes = scala.io.StdIn.readInt()

      print("\n Enter the goal : ")
      var goal = scala.io.StdIn.readInt()

      print("\nEnter the number of times gambler will play  :")
      val times = scala.io.StdIn.readInt()

      var counter: Int = 0

      while(stakes != goal && stakes != 0 && counter < times){
        if(Math.random() > 0.5){
          win += 1
          stakes += 1
        }else{
          loss += 1
          stakes -= 1
        }
        counter += 1
      }

      print("\n Number of times gambler win : "+win)
      print("\n Win percentage  : "+(win.toFloat/times.toFloat)*100)
      print("\n Loss percentage  : "+(loss.toFloat/times.toFloat)*100)
      flag = false
    }
    catch {
      case ex: NumberFormatException => {
        print("Please enter valid input")
      }
    }
    }
  }


}
