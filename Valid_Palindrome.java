
import java.util.*;
class Valid_Palindrome {
    public boolean isPalindrome(String s) {
       
      // use regular expression to remove all non alaphabetic characters in string
       String str=s.replaceAll("[^A-Za-z0-9]", "");
       System.out.println(str);
       str=str.toLowerCase();
       char arr[]=str.toCharArray();
       char arr1[]=new char[arr.length];
        int m=0;
       for(int i=arr.length-1;i>=0;i--){
           arr1[m]=arr[i];
           m++;  
       }
       for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
       }
       
       boolean res=Arrays.equals(arr,arr1);
       return res;
    }
     public static void main(String args[]){
         String s="A man, a plan, a canal: Panama";
         Main m=new Main();
         boolean result=m.isPalindrome(s);
         System.out.println(result);
     }
}
