import java.io.*;
import java.util.*;
class shift{
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        final int n=5;
        int k=3;
        int arr[]={2,3,4,5,6};
        int ans[]=new int[5];
        if(k>n){
            k=k%n;
            for(int i=0;i<k;i++){
                ans[i]=arr[n-k+i];
            }
        int ind=0;
        for(int i=k;i<n;i++){
            ans[i]=arr[ind];
            ind++;
        }
        for(int m:ans){
            System.out.println(m);
        }
    }
}