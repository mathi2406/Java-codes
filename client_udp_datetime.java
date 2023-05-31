import java.net.*;
import java.io.*;
import java.util.*;
class client_udp_datetime
{
public static void main(String args[]) throws Exception
{
DatagramSocket ds=new DatagramSocket();
Scanner sc=new Scanner(System.in);
System.out.println("Client running");
while(true)
{
String s=sc.nextLine();
byte[] b=s.getBytes();
InetAddress ia=InetAddress.getLocalHost();
DatagramPacket dp=new DatagramPacket(b,b.length,ia,5674);
ds.send(dp);
if(s.equalsIgnoreCase("stop"))
break;
byte[] b1=new byte[1024];
DatagramPacket dpp=new DatagramPacket(b1,1024);
ds.receive(dpp);
String date=new String(dpp.getData(),0,dpp.getLength());
System.out.println("Current date and time is "+date);
System.out.println();
}
}
}
