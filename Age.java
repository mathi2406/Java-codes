import java.io.*;
import java.util.*;
class Age
{
	int age_a,age_b;
        boolean compare(int age_a,int age_b)
	{
		if(age_a>age_b)
		{
		return true;
		}
		else
		{
		return false;
		}
	} 
public static void main(String args[])
{
	int x=48;
	int y=20;
        Age ob=new Age();
	boolean z=ob.compare(x,y);
	
	if(z==true)
	System.out.println("B is younger");
	else
	System.out.println("A is younger");
}
}