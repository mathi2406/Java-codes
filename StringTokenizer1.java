/* A Java program to illustrate working of StringTokenizer
   class:*/
import java.util.*;
public class StringTokenizer1
{
    public static void main(String args[])
    {
        System.out.println("Using Constructor 1 - ");
        StringTokenizer st1 =
             new StringTokenizer("Hello Geeks How are you", " ");// after typing string put comma and specify in double quotes the space or : or anything
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
  
        System.out.println("Using Constructor 2 - ");
        StringTokenizer st2 = 
             new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());
  
        System.out.println("Using Constructor 3 - ");
        StringTokenizer st3 = 
             new StringTokenizer("JAVA : Code : String", " :",  true);
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
}