import java.io.*;
import java.net.*;
import java.util.*;
public class server_tcp_arical
{
 public static void main(String[] args) throws Exception 
{
  ServerSocket ss = new ServerSocket(3233);
 System.out.println("Server waiting");
 Socket s = ss.accept();
 System.out.println("Connected to: "+s.getInetAddress());
 BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
 PrintStream p=new PrintStream(s.getOutputStream());
int x=Integer.parseInt(br.readLine());
int y=Integer.parseInt(br.readLine());
String o=br.readLine();
int z;
if(o.equals("+"))
{
z=x+y;
}
else if(o.equals("-"))
{
 z=x-y;
}
else if(o.equals("*"))
{
z=x*y;
}
else
{
z=x/y;
}
p.println(String.valueOf(z));
System.out.println("response given");
}
}


