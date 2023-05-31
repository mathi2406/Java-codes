import java.io.*;
import java.net.*;
class server_udp_fact
{
public static void main(String arg[]) throws Exception
{
DatagramSocket ds=new DatagramSocket(3456);
System.out.println("Server running");
while(true)
{
byte[] b=new byte[1024];
DatagramPacket dp=new DatagramPacket(b,1024);
ds.receive(dp);
String s=new String(dp.getData(),0,dp.getLength());
int n=Integer.parseInt(s);
if(n<0)
break;
int fact=1;
for(int i=1;i<=n;i++){
fact*=i;
}
byte[] res=String.valueOf(fact).getBytes();
DatagramPacket dpp=new DatagramPacket(res,res.length,dp.getAddress(),dp.getPort());
System.out.println("Factorial of the number is calculated and response given");
ds.send(dpp);
System.out.println();
}
}
}