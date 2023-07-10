object Q_2 extends App {
  def gcd(a: Int, b: Int) : Int = b match{
    case 0 => a
    case x if(x>b) => gcd(x, a)    //if b>a - swap
    case _ => gcd (b, a%b)        //else - b<a and b!=a
  }

  def prime (p: Int, n: Int=2) : Boolean = n match{
    case x if(x==p) => true             //2 is a prime number
    case x if(gcd(p, x)>1) => false      //2 is a divisor of p
    case x => prime(p, x+1)             //checks for other values (3, 4,....)
  }

  def primeSeq(n: Int, i: Int=2) : Unit = {
    if(n>i && prime(i)) print(i + " ")
    primeSeq(n, i+1)
  }

  primeSeq(10)
}

