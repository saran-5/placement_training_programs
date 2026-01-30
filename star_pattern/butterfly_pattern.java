package star_pattern;
import java.util.*;
public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        int n=in.nextInt();
        // Upper Half
        for(int i=1;i<=n;i++){
            // Left Wing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Right Wing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for(int i=n;i>=1;i--){
            // Left Wing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Right Wing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
