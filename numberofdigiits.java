import java.util.Scanner;
public class numberofdigiits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp=n;
        int c=0;
        while(temp>0){
            temp=temp/10;
            c++;
        }
        int sum=0;
        temp=n;
        while(temp>0){
            int rem=temp%10;
            sum += Math.pow(rem,c);
            temp=temp/10;
        }
        if(sum==n)
            System.out.println("am");
        else
            System.out.println("not am");
    }
}