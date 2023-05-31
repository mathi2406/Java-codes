import java.io.*;
import java.util.*;

class Time 
{
    int hours;
    int minutes;
    int seconds;
public Time()
      {                       
       hours = 0;
       minutes = 0;
       seconds = 0;
      }
 public Time(int h, int m, int s)
      {       
        hours = h;
        minutes = m;
        seconds = s;
      }
    void display()
      {
        System.out.println("TIME:");
       System.out.println(hours +":" + minutes + ":" + seconds+"\n");
      }  
    void add(Time x, Time y) 
      {
        int tmp=0;
        seconds = x.seconds + y.seconds;
         if(seconds > 59)
	   {
            seconds = seconds-60;
            tmp++;
             }  
       minutes = x.minutes + y.minutes+tmp;
       tmp=0;
       if(minutes > 59)
	  {
          minutes=minutes-60;
          tmp++;
           }
          hours = x.hours + y.hours+tmp;
       if(hours >= 24)
	{
          hours=hours-24;
	}
      System.out.println(hours + ":" + minutes +":" + seconds+"\n");  
    
 }       

public static void main(String args[])
 {
Time time1=new Time(20,50,30);
Time time2=new Time(10,30,43);

time1.display();
time2.display();

System.out.println("After ADD: ");
time1.add(time1, time2);
}
}