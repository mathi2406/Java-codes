import java.io.*;
import java.util.*;

class StdGaussian
{
 public static void main(String args[])
  {
	int Min=0;
	int Max=1;
	double u = Min+(Math.random()*((Max-Min)+1));
	double v = Min+(Math.random()*((Max-Min)+1));
	System.out.println("value of u is "+u);
	System.out.println("value of v is "+v);
	System.out.println("Now let us generate random number from Gaussian Distribution formula");
	double w=(Math.sin(2*Math.PI*v))*(Math.pow(-2*Math.log(u),1/2));
	System.out.println("Value of w is "+w);
  }
}
	