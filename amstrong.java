import java.util.Scanner;
public class amstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int original = n;
        int sum=0;
        while (n>0) {
            int r=n%10;
            sum +=r*r*r;
            n=n/10;
        }
        if (sum == original) {
            System.out.println("am");
        } else {
            System.out.println("Not am");
        }
    }

}
