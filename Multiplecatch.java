import java.io.*;
import java.util.*;
 
class Mutiplecatch
{
   public static void main(String args[])
   {
      int i=args.length;
      try
      {
         String myString[]=new String[i];

         if(myString[0].equals("Java"));
            System.out.println("First word is Java!");
      }
      catch(NullPointerException e)
      {
         System.out.println(e);
      }
	catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e);
      }
       
      System.out.println("Number of arguments = "+i);

      int x=0;
      try
      {
         x=18/i;
      }
      catch(ArithmeticException e)
      {
         System.out.println(e);
      }
 
     
      int y[]={555,999};
      try
      {
         y[i]=x;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e);
      }
 
   }
}