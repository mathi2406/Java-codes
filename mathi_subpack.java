import java.io.*;
import university.site.*;
import university.scope.*;
import java.util.*;
class mathi_subpack
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter dept name of site school");
String sch1=sc.nextLine();
//create obj for class and call meth
IT s1=new IT();
String scho1=s1.school1(sch1);
System.out.println(scho1);


System.out.println("Enter dept name of scope school");
String sch2=sc.nextLine();
//create obj for class and call meth
CSE s2=new CSE();
String scho2=s2.school2(sch2);
System.out.println(scho2);
}
}
