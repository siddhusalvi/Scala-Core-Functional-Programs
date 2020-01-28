/*
3. Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or no
 */
object leap_year {
  def main(args:Array[String]):Unit ={
    print("Enter a Year : ")
    val year = scala.io.StdIn.readInt()
    var flag: Boolean = false
    if( year % 400 == 0 ||(year%4 == 0 && year%100 != 0)) {
      flag = true
    }
    if(flag){
      print(year+" is a leap year")
    }else{
      print(year+" is not a leap year")
    }
    }
  }

