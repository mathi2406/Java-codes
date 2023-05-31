import java.util.*;
public class fibonacci{
    public int abc(int n){
        int a=0,b=1,c=a+b;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;        
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        fibonacci f=new fibonacci();
        int res= f.abc(n);
        System.out.println(res);
        
    }
}