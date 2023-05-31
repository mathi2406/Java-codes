import java.util.*;
import java.io.*;
import java.lang.*;
class Fnover
{
	double a=5;
	void area(int a)
	{
	 System.out.println("Area of square is " +a*a);
	}
	void area(int l,int b)
	{
	System.out.println("Area of rectangle is " +l*b);
	}
	void area(float r)
	{ 
	System.out.println("Area of circle is " +Math.PI*r*r);
	}
 	public static void main(String args[])
	{
		Fnover ob=new Fnover();
		ob.area(9.0f);
		ob.area(11,21);
		ob.area(21);
	}
}