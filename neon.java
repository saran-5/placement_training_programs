import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        int sq=n*n; 
        int sum=0;
        while(sq>0){
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println("neon no");
        } else{
            System.out.println("not neon");
        }
    }
    
}
