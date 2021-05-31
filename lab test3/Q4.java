 class Q4{   
  void run()
{
  System.out.println("Vehicle is running");
  }  
}  
class Bike extends Q4{    
  void run()
  {
  System.out.println("Bike is running safely");
  }  
  
  public static void main(String args[])
  {  
  Bike obj = new Bike();  
  obj.run(); 
  }  
} 