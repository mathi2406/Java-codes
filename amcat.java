import java.io.*;
import java.util.*;
import java.lang.*;
class amcat
{
public static void main(String args[])
{
int n;
  Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of pdts");
 n=sc.nextInt();
 int[] arr=new int[n];

System.out.println("Enetr the temperatures");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
int count=0;
for(int i=0; i<n; i++)
{
if(arr[i]<0)
{
count++;
}
}
System.out.println("The number of products to be freezed "+count);
}
}


