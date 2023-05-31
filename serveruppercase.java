import java.io.*;
import java.net.*;
import java.util.*;
public class serveruppercase
{
 public static void main(String[] args) throws Exception 
{
 Scanner sc = new Scanner(System.in);

 ServerSocket ss = new ServerSocket(3233);
while(true)
{
 System.out.println("Server waiting");
 Socket s = ss.accept();
 System.out.println("Connected to: "+s.getInetAddress());

BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintStream p=new PrintStream(s.getOutputStream());
String x=br.readLine();
String y=x.toUpperCase();
p.println(y);
System.out.println("response given");
s.close();
br.close();
p.close();
}
}
}
