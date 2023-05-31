import java.util.Random;
import java.io.*;
class vote
{
 public static int c1,c2,c3,c4;
 public static int arr[]=new int[240];
 public void random()
 {
 Random r=new Random();
for (int i=0;i<240;i++)
{
int a=r.nextInt(4);
arr[i]=a+1;
}
 }
}
class thread1 extends Thread
{
 public void run()
 {
 for(int i=0;i<60;i++)
 {
 if(vote.arr[i]==1)
 {
 vote.c1=vote.c1+1;
 }
 else if(vote.arr[i]==2)
 {
 vote.c2=vote.c2+1;
 }
 else if(vote.arr[i]==3)
 {
 vote.c3=vote.c3+1;
 }
 else{
 vote.c4=vote.c4+1;
 }
 }
 }
}
class thread2 extends Thread
{
 public void run()
 {
 for(int i=60;i<120;i++)
 {
 if(vote.arr[i]==1)
 {
 vote.c1=vote.c1+1;
 }
 else if(vote.arr[i]==2)
 {
 vote.c2=vote.c2+1;
 }
 else if(vote.arr[i]==3)
 {
 vote.c3=vote.c3+1;
 }
 else{
 vote.c4=vote.c4+1;
 }
 }
 }
}
public class votes_akshaya
{
public static void main(String[] args) throws InterruptedException{
 vote a=new vote();
 a.random();
 thread1 t1=new thread1();
 thread2 t2=new thread2();
 
 t1.start();
 t1.join();
 t2.start();
 t2.join();
 
 System.out.println(vote.c1 +" "+ vote.c2 +" " +vote.c3+" " +vote.c4);
 if(vote.c1>= vote.c2 && vote.c1>=vote.c3 && vote.c1>=vote.c4)
 {
 if (vote.c1==vote.c2 )
 {
 System .out.println("A and B got same vote ");
 }
 else if(vote.c1==vote.c3)
 {
 System .out.println("A and C got same vote ");
 }
 else if(vote.c1==vote.c4)
 {
 System .out.println("A and D got same vote ");
 }
 else
 {
 System.out.println("A is the winner");
 }
 }
 else if(vote.c2>=vote.c1 && vote.c2>=vote.c3 && vote.c1>=vote.c4)
 {
 if(vote.c2==vote.c1 )
 {
 System.out.println("B and A got same vote ");
 }
 else if(vote.c2==vote.c3)
 {
 System.out.println("B and C got same vote ");
 }
 else if(vote.c2==vote.c4)
 {
 System .out.println("B and D got same vote ");
 }
 else
 System.out.println("B is the winner");
 }
 else if(vote.c3>=vote.c1 && vote.c3>=vote.c2 && vote.c1>=vote.c4)
 {
 if(vote.c3==vote.c2)
 {
 System.out.println("C and B are equal");
 }
 else if (vote.c3==vote.c1)
 {
 System.out.println("C and A have same vote");
 }
 else if(vote.c3==vote.c4)
 {
 System .out.println("C and D got same vote ");
 }
 else
 System.out.println("C is the winner");
 }
 else if(vote.c4>=vote.c1 && vote.c4>=vote.c2 && vote.c4>=vote.c3)
 {
 if(vote.c4==vote.c2)
 {
 System.out.println("D and B are equal");
 }
 else if (vote.c4==vote.c1)
 {
 System.out.println("A and D have same vote");
 }
 else if(vote.c4==vote.c3)
 {
 System .out.println("C and D got same vote ");
 }
 else
 System.out.println("D is the winner");
 }
}
}
