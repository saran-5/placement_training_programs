import java.util.Scanner;
public class largestdigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        int largest=0;
        while(n>0){
            int r=n%10;
            if(r>largest){
                largest=r;
            }
            n=n/10;
        }
        System.out.println("largest digit is "+largest);
    }
    
}
