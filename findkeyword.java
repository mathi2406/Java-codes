
public class findkeyword{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String check;
        String arr[]={'break','case','continue','default','defer','else','for','func','goto','if','map','range','return','struct','type','var'};
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(check)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}