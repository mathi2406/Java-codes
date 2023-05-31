import java.io.*;
import java.util.*;
public class digit{
    public static void main(String args[]){
        int n1=11,n2=15;
       int n=(n2-n1)+1;
        int arr[]=new int[n];
        arr[0]=n1;
        for(int i=1;i<n;i++){
            arr[i]=n1+1;
            n1=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
           
    
    }
}
