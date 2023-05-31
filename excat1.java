import java.util.*;

class excat1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total numbers : ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" numbers to find sum ");
		int sum=0;
		int s[]=new int[n];
		
		try{
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		}catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		
		for(int i=0;i<n;i++)
		{
			sum+=s[i];
		}
		System.out.println("Sum is :"+sum);
	}
} 