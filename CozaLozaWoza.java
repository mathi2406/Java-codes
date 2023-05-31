import java.io.*;
import java.util.*;
public class CozaLozaWoza
{
   void print(int count, int perlinecount)
     {
        boolean b;
        for (int i = 1; i <= count; i++) 
	  {
           b = false;
            if (i % 3 == 0)
	    {
                System.out.print("Coza");
               b = true;
             }
            if (i % 5 == 0) 
	   {
                System.out.print("Loza");
                b = true;
             }
            if (i % 7 == 0) 
	    {
                System.out.print("Woza");
                b = true;
             }            
            if ( ! b)
	    {
                System.out.print(i);
             }
            System.out.print(" ");
            
            if (i % 11 == 0) 
	    {
                System.out.println();
             } 
        }
    
        System.out.println(); 
        
    }
   
    public static void main(String[] args)
    {
        CozaLozaWoza obj= new CozaLozaWoza();
        obj.print(110, 11);
    }
}
  