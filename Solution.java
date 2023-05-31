import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        st=st.replace("@", " ");
        st=st.replace("$", " ");
        String arr[]=st.split(" ");
        int max=0;
        for(int i=0;i<arr.length;i++)
        max=Math.max(max,arr[i].length());
        System.out.println(max+1);
    }
 }