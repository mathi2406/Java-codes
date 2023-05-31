import java.io.*;
import java.util.*;
class Dog
{
  String name,sound;
 String s;
 Dog( String s)
{
this.s=s;
}
 
  String getname()
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
    name=sc.nextLine(); 
   return name;   
  }
  
  String speak()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter sound");
     sound=sc.nextLine();
     return sound;
  }
}
public class DogTest
{
   public static void main(String args[])
   {
      Dog dog=new Dog("Spike");
      System.out.println(dog.getname()+" says "+dog.speak());
   }
}