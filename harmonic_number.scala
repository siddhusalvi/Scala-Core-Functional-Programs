/*
5. Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */

object harmonic_number {
  def main(args: Array[String]): Unit = {
    var flag = true
    while(flag){
      println("Enter a number to find its harmonic number : ")
      val number = scala.io.StdIn.readInt()
      if(number > 0){
       flag = false
       var harmonic : Float = 1
       if(number < 2){
         print("Harmonic of "+number+" is : "+harmonic)
       }else{
        for(i <-2 to number){
          harmonic += 1/i.toFloat
        }
         println("Harmonic of "+number+" is : "+harmonic)
       }
     }
   }
  }
}
