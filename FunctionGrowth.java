import java.io.*;
import java.util.*;
class FunctionGrowth
{
	public static void main(String args[])
	{
           System.out.println("logN  \tN  \tNlogN  \tN^2   \tn^3    \t\t2^N");
	 for(long N=32;N<=2048; N=N*2)
	   {
	 	System.out.print((int) Math.log(N));
		System.out.print('\t');
		System.out.print(N);
		System.out.print('\t');
		System.out.print((int)(N* Math.log(N)));
		System.out.print('\t');
		System.out.print(Math.pow(N,2));
		System.out.print('\t');
		System.out.print(Math.pow(N,3));
		System.out.print("\t\t");
		System.out.print((double)Math.pow(2,N));
		System.out.println();
            }
	}
}
