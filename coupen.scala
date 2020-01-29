import scala.util.Random
import scala.collection.mutable.TreeMap
object Coupen {
  def main(args: Array[String]): Unit = {
    var flag = true
    var trial: Int = 0
    var count: Int = 0
    while(flag){
      try{
        print("\n Enter total number of copens : ")
        var cards = scala.io.StdIn.readInt()
        print("\nEnter the coupens : ")
        var num = scala.io.StdIn.readInt()
        var record = TreeMap(num->false)
        for(i<-2 to cards){
           print("\n for "+i+" : ")
          num = scala.io.StdIn.readInt()
          record += (num -> false)

        }
        //print(record.toString())
        var min = record.firstKey
        var max = record.lastKey

        while(count < cards){
          var rand = getNum(min,max)
          //print("\nrand is"+rand+" count is "+count)
          //var temp = record(rand)
          //print("\n record is"+temp)



          if(record.contains(rand) && (!record(rand))){
              record(rand) = true
              //print("\n in count block")
              count += 1
          }
          trial +=1
        }
      System.out.println("Trials are : "+trial)
      flag = false
      }
      catch
        {
          case ex: NumberFormatException =>
          {
           print("Please enter valid input")
          }
      }


    }


    def getNum(min:Int,max:Int):Int= {
      val rnd = new Random
      min + rnd.nextInt((max - min)+1)
    }
  }
}
