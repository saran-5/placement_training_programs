package two_D_array;
import java.util.*;
public class jagged {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r,c;
        System.out.println("enter r: ");
        r=in.nextInt();
        int[][]a=new int[r][];
        for(int i=0;i<r;i++){
            System.out.print("enter c: ");
            c=in.nextInt();
            a[i]=new int[c];
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Matr: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}
