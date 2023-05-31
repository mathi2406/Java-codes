import java.io.*;
import java.util.*;
import factorial.*;


class first extends Exception
{
first(int n)
{
super(n);
}
}
class second extends Exception
{
second(int n)
{
super(n);
}
}
class third extends Exception
{
third(int n)
{
super(n);
}
}
class calling
{
int a;
calling(int d)
{
 a=d;
}
}
void check() throws Exception
{
if(a>=0 && a<=16)
{
throw new first(" argument is negative");
}
else if(a<0)
{
throw new second("range is between 0-16");
}
else
{
throw new third("argument i s over 16");
}
}
public class Factorial
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");
calling c=new calling(n);
try
{
c.check();
}
catch(Exception e)
{
System.out.println(e);
}
int n=sc.nextInt();
Fact ob=new Fact(n);
int res=ob.factorial();
System.out.println("The factorial is "+res);
}
}

}