class Rational (x: Int, y:Int)  {
  def numer = x
  def denom = y
  
  def neg: Rational = new Rational(-numer, denom)
  
  def sub(that: Rational) = 
    new Rational (numer * that.denom -  that.numer * denom, denom * that.denom)
  
  
  
  
 }                 

object rationals {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(3,2)
  val a = new Rational(1,1)
  
  a = x.sub(x).sub(y)
  x.sub(a).sub(z)
}

  
  
