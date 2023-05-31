class Example 
{ 
 synchronized void display() 
 { 
 Thread t=Thread.currentThread(); 
 //synchronized(this) 
 //{ 
 
 for(int i=1;i<=10;i++) 
 { 
 try 
 { 
 Thread.sleep(1000); 
 System.out.println("ID "+t.getId()+" "+i); 
 } 
 catch(Exception e) 
 {} 
 
 } 
 //} 
 
 } 
} 
class Testsync extends Thread 
{ 
 Example e; 
 Testsync(Example e) 
 { 
 this.e=e; 
 } 
 
 public void run() 
 { 
 e.display(); 
 } 
} 
class Testsyncmain 
{ 
 public static void main(String args[]) 
 { 
 Example ex=new Example(); 
 Testsync ob1=new Testsync(ex); 
 ob1.start(); 
 Testsync ob2=new Testsync(ex); 
 ob2.start(); 
 try{ 
 ob1.join(); 
 ob2.join(); 
} 
catch(Exception e){} 
 } 
} 