class Rational (x: Int, y:Int)  {
  def numer = x
  def denom = y
  
  def neg: Rational = new Rational(-numer, denom)
  
  def sub(r: Rational, s:Rational): Rational =
    new Rational (r.numer * s.denom - s.numer * r.denom, r.denom * s.denom)
  
  def makeString(r: Rational) = 
    r.numer + "/" + r.denom
  
  makeString(sub(new Rational(3,4), new Rational(5,8)))
  
  
