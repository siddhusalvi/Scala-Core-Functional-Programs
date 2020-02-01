/*
3. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
 */

import java.util.concurrent.TimeUnit
object stopwatch {
  def main(args: Array[String]): Unit = {
    var flag = true
    while(flag){
     try{
        print("\n Enter any key to start stopwatch : ")
        var ip = scala.io.StdIn.readLine()
        var start, end :Long = 0
        start = System.nanoTime()
        print("\n Enter any key to end stopwatch : ")
        ip = scala.io.StdIn.readLine()
        end = System.nanoTime()
        print("Elapsed time : "+TimeUnit.SECONDS.convert(end-start,TimeUnit.NANOSECONDS))
        flag = false
     }catch{
       case _: Throwable =>
         print("Error occured.")
     }
    }
  }
}
