/*
4. Cross Game or Tic-Tac-Toe Game
a. Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1
is the Computer and the Player 2 is the user. Player 1 take Random Cell that is
the Column and Row.
b. I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
c. Logic -> The User or the Computer can only take the unoccupied cell. The Game
is played till either wins or till draw...
d. O/P -> Print the Col and the Cell after every step.
e. Hint -> The Hints is provided in the Logic. Use Functions for the Logic…
 */

import scala.util.Random
object tic_tac_toe {
  def main(args: Array[String]): Unit = {
    var playflag = true
    while(playflag){
      try {
        var data = new Array[Int](9)
        var flag = true
        var flag3 = true
        var pos : Int = 0
        //Starting the game
        for(i <- 1 to 9 if flag3){

          if(i>4 && checkWin(data)){
            flag3 = false
            if((i-1)%2==0){
              print("\n Computer")
            }
            else{
              print("\n You")
            }
            print(" won")
            current_situation(data)

          }
          if(flag){
            print("\nCurrent situation :")
            current_situation(data)
            var field = true
            while(field){
              print("\n Enter your position below : ")
              pos = scala.io.StdIn.readInt()
              if(pos > 0 && pos< 10 && data(pos-1) == 0){
                field = false
                data(pos - 1) = 5
              }
              else
              {
                print("\n please enter valid input :")
              }

            }
            flag = false
          }else{
            var field = true
            while(field){
              pos = randInt(1,9)
              if (pos > 0 && pos < 10 && (data(pos - 1) == 0)) {
                field = false
                data(pos - 1) = 3
              }
            }
            flag = true
          }
        }
        playflag = false
      }
      catch
        {
          case ex: NumberFormatException =>
            print("\nPlease enter valid input")
        }
    }

    // Function to check win or loss
    def check(sum: Int): Boolean = {
      //println("in check");
      if (sum == 9 || sum == 15) {
        true
      }
      else {
        false
      }
    }
    //Generating random number for CPU player
    def randInt(min:Int,max:Int):Int={
      val rnd = new Random
      min + rnd.nextInt((max - min)+1)
    }
    //Printing current game status
    def current_situation(data:Array[Int]):Unit={
      var str : String =""
      str = "\n\t\t\t"
      for(i <- data.indices){
        if(data(i)==3){
          str += "0" + " "
        }else if(data(i)==5){
          str += "*" + " "
        }
        else{
          str+= "_ "
        }
        if((i+1)%3==0){
          str += "\n\t\t\t"
        }
      }
      println(str)
    }
    //tracking game status
    def checkWin(d: Array[Int]): Boolean = {
      var sum = 0
      sum = d(0) + d(1) + d(2)
      if (check(sum)){
        true
      }else if(check(d(3) + d(4) + d(5))) {
        true
      }else if(check(d(6) + d(7) + d(8))) {
        true
      }
      else if(check(d(0) + d(3) + d(6))) {
        true
      }
      else if(check(d(1) + d(4) + d(7))) {
        true
      }
      else if(check(d(2) + d(5) + d(8))) {
        true
      }
      else if(check(d(0) + d(4) + d(8))) {
        true
      }
      else if(check(d(2) + d(4) + d(6))) {
        true
      }else{
        false
      }
    }
  }
}