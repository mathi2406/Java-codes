import java.lang.Math;
import java.util.*;

class Rect extends Thread 
{
public double l;
public double b;
public double res1;
public Rect(double l1,double b1) 
{
l=l1;
b=b1;
}
public void run()
 {
System.out.println("Executing t1..");
res1= l*b;
System.out.println("Rect area = "+res1);
}
}
class Square1 extends Thread
 {
public double side;
public double res2;
public Square1(double sidee) 
{
side = sidee;
}

public void run()
 {
System.out.println("Executing t2");
res2 = 4*(side*side);
System.out.println("Square area = "+res2);
}
}
class Circle extends Thread 
{
public double dia;
public double res3;
public Circle(double diameter) 
{
dia = diameter;
}

public void run()
 {
System.out.println("Executing t3");
double radius=dia/2;
res3 = 3.14*radius*radius;
System.out.println("circle area = "+res3);
}
}
class MultiThread_cat2_1 
{
public static void main(String args[]) 
{
Rect r = new Rect(35.5,15);
Square1 s = new Square1(4);
Circle c = new Circle(7.5);
r.start();
s.start();
c.start();
try { 
r.join();
s.join(); 
c.join();
}
catch(InterruptedException e) {
System.out.println(e);
}
System.out.println("Total area = "+(r.res1-(s.res2+c.res3)));

} 
}