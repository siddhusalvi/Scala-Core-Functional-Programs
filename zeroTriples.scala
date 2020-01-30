/*
2. Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.
 */
object zero_triplet {
  def main(args: Array[String]): Unit = {
    try{
      var data = Array(-3, -2, -1, 0, 1, 2, 3)
      findTriplet(data)

    }catch {
      case _ =>
        print("Something went wrong. Error occured : ")
    }
  }
  // Function to find triplate
  def findTriplet(lst:Array[Int]):Unit = {
    for(i <- 0 until(lst.length-2)){
      for(j <- i+1 until(lst.length-1)){
        for(k <- j+1 until(lst.length)){
          if(lst(i) + lst(j) + lst(k) == 0){
            print("\n"+lst(i)+" + "+lst(j)+" + "+lst(k)+" = 0")
          }
        }
      }
    }
  }
}
