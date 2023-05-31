import java.net.*;
import java.io.*;
class server_sum_n
 {
	public static void main(String args[]) throws Exception
	{
	System.out.println("Server waiting..");
	ServerSocket ss=new ServerSocket(7234);
	Socket s=ss.accept();
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	PrintStream p=new PrintStream(s.getOutputStream());
	while(true)
	{
	int n=Integer.parseInt(br.readLine());
	if(n<=0)
	break;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=Integer.parseInt(br.readLine());
	}
	int sum=0;
	for(int i=0;i<n;i++){
	sum+=a[i];
	}
	System.out.println("Sum calculated and value returned...");
	p.println(String.valueOf(sum));
	System.out.println();
	}
   }
}