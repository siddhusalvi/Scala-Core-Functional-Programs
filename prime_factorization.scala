/*
6. Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
 */
import java.lang.Math
object prime_factorization {
  def main(args: Array[String]): Unit = {
    var flag = true
    while (flag) {
      print("\nEnter a positive number to find Prime factorization : ")
      var num = scala.io.StdIn.readInt()
      if(num > 0){
        if(num == 1){
          println("No prime factors.")
        }else{
          print_prime_factors(num)
        }
       flag = false
      }else{
        println("Please enter valid input.")
      }

    }
    def print_prime_factors(num: Int):Unit ={
      var flag = true
      for(i <- 2 to num) {
        if(flag) {
          if(prime(i) && num % i == 0){
            print(i+" ")
            flag = false
            print_prime_factors(num/i)
          }
        }
      }
    }
    def prime(num:Int):Boolean = {
      for(i<- 2 to math.sqrt(num).toInt){
        if(num % i == 0){}
        false
      }
      true
    }
  }
}