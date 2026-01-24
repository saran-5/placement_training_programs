import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("enter number");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            sum+=i;
            System.out.println(sum);
        }
    }
}