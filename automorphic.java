
import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        int sq = n * n;
        int temp = n;
        boolean flag = true;
        while (temp > 0) {  
            if (temp % 10 != sq % 10) {
                flag = false;
                break;
            }
            temp /= 10;
            sq /= 10;
        }
        if (flag) {
            System.out.println("automorphic");
        } else {
            System.out.println("not automorphic");
        }

    }
}