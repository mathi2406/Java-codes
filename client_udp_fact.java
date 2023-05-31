import java.io.*;
import java.util.*;
import java.net.*;
class client_udp_fact
{
	public static void main(String args[]) throws Exception
	{
	DatagramSocket ds=new DatagramSocket();
	Scanner sc=new Scanner(System.in);
	System.out.println("Client running");
	while(true)
	{
	System.out.println("Enter a number to find factorial");
	int n=sc.nextInt();
	byte b[]=String.valueOf(n).getBytes();
	InetAddress ia=InetAddress.getLocalHost();
	DatagramPacket dp=new DatagramPacket(b,b.length,ia,3456);
	ds.send(dp);
	if(n<0)
	break;
	byte b1[]=new byte[1024];
	DatagramPacket dpp=new DatagramPacket(b1,1024);
	ds.receive(dpp);
	String fact=new String(dpp.getData(),0,dpp.getLength());
	int res=Integer.valueOf(fact);
	System.out.println("Factorial of "+n+" is = "+fact);
	System.out.println();
	}
    }
}
