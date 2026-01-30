package star_pattern;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter : ");
    int n=in.nextInt();
    int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum+=1;
                System.out.print(sum+" ");
            }
            System.out.println();
           
        }
    }
} 
