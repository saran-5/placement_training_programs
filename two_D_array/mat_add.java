package two_D_array;

import java.util.Scanner;

public class mat_add {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter A: ");
        int[][]a=new int[2][2];
        
        int[][]b=new int[2][2];
        int[][]c=new int[a.length][b.length];
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }System.out.println("enter B: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.println("sum: "+c[i][j]);
    }
}
}
}