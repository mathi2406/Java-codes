import java.io.*;
import java.net.*;
import java.util.*;
class clientuppercase
{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",3233);
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintStream p=new PrintStream(s.getOutputStream());
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
p.println(x);
p.flush();
String s1=br.readLine();
System.out.println(s1);
br.close();
p.close();
s.close();
}
}