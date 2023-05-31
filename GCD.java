import java.util.*;

public class GCD
 {
   int gcd(int x,int y)
  {
	if(x==0)
	{
	return y;
	}
        else if((x>y) && (x%y==0))
	{
	return y;
	}	
	else
        {
	return gcd(y%x,x);
        }
     }
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter value of x");
	int x=sc.nextInt();

	System.out.println("Enter the value of y");
	int y=sc.nextInt();

        GCD g=new GCD();
	int z=g.gcd(x,y);
	System.out.println("GCD of x and y is " +z);
  }
}
         