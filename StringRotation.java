public class StringRotation{
    public static void main(String args[]){
      String a="mathi";
      String b="imath";
      //.contains method checks the possible rotations alone
      String c=a+a;
      if(a.length()!=b.length()){
        System.out.println(" length no");
    }
      else if(c.contains(b)){
        System.out.println("yes");
              }
    else{
        System.out.println("no");
    }
    }
}