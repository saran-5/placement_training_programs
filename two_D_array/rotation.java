package two_D_array;
import java.util.*;
public class rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row to rotate: ");
        int r=in.nextInt();
        System.out.println("enter no.of rotation: ");
        int rr=in.nextInt();
        int[][]a={{1,2,3,4},{4,3,1,2},{5,6,7,8},{7,6,3,1}};
        int c=a[0].length;
        rr=rr%c;  
        for (int k=0;k<rr;k++) {
            int temp=a[r][0];
            for (int j=0;j<c-1;j++) {
                a[r][j]=a[r][j+1];
            }
            a[r][c-1]=temp;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
}
}