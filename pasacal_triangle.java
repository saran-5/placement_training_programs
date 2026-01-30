import java.util.*;
public class pasacal_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}