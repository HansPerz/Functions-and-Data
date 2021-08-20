var bank : List[Account] = List()

class Account (id:String, n:Int, b:Double)
{
  val nic: String = id
  val acumber: Int = n
  val balance : Double = b
  
  override def toString = 
    "["+nic+":"+acnumber +":"+ balance+"]"
  
  def transfer (a:Account, b:Double) = 
    def withdraw (a:Double) = 
      this.balance = this.balance-a
    
    def deposit(a:Double) = 
      this.balance = this.balance+a
  
  val find = (n:String, b:List[Account]) =>
    b.filter (x => x.nic.equals(n))
  
  val overdraft = (b:List[Account]) => 
    b.filter (x => x.nic.equals(n))
  
  val balance = (b:List[Account]) => 
    b.reduce (x => x.nic.equals(n))
  
  val interest = (b:List[Account]) =>
    b.map (x => x.nic.equals(n))
  
}

