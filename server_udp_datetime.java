import java.io.*;
import java.net.*;
import java.util.Date;
class server_udp_datetime
{
public static void main(String args[]) throws Exception
{
DatagramSocket ds=new DatagramSocket(5674);
System.out.println("Server waiting");
while(true)
{
byte b[]=new byte[1024];
DatagramPacket dp=new DatagramPacket(b,1024);
ds.receive(dp);
String s=new String(dp.getData(),0,dp.getLength());
System.out.println("Client : "+s);
if(s.equalsIgnoreCase("stop"))
break;
String dateTime=new Date().toString();
byte[] dT=dateTime.getBytes();
DatagramPacket dpp=new DatagramPacket(dT,dT.length,dp.getAddress(),dp.getPort());
System.out.println("Response given");
ds.send(dpp);
System.out.println();
}
}
}
