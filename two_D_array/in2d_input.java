package two_D_array;
import java.util.*;
public class in2d_input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter: ");
        int[][]a=new int[3][3];
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("array: "+a[i][j]);
            }
        }
    }
}
