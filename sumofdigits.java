import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum+=r;
            n =n/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
    
}
