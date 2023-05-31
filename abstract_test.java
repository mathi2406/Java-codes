abstract class Bank
{    
abstract int getInterest();    
}    
class SBI extends Bank
{    
int getInterest()
{
return 7;
}    
}    
class PNB extends Bank
{    
int getInterest()
{
return 8;
}    
}    
   
class abstract_test
{    
public static void main(String args[])
{    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getInterest());    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getInterest());    
}
}    
