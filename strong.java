import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();
        int or= n; 
        int sum=0;
        while(n>0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==or){
            System.out.println("strong no");
        } else{
            System.out.println("not strong");
        }  

    }
}
