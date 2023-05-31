import java.io.*;
import java.util.*;
class Message
{
	private String str;
	String str2;
 Message(String str1)
 {
	str=str1;
  }
 void print()
 {
	System.out.println("something");
  }
 void print(String str2)
 {
     System.out.println(str +str2);
  
 }
public static void main(String args[])
{
Message m= new Message("Mathi");
m.print();
m.print("vathani");
}
}
