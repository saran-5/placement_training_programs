package two_D_array;

import java.util.Scanner;

public class jagged_add {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("enter A: ");
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
        
        System.out.println("enter B: ");
        int[][]b=new int[r][];
        for(int i=0;i<r;i++){
            System.out.print("enter c: ");
            c=in.nextInt();
            b[i]=new int[c];
            for(int j=0;j<c;j++){
                b[i][j]=in.nextInt();
            }
        }
        
        int[][]result=new int[r][];
        for(int i=0;i<r;i++){
            result[i]=new int[a[i].length];
            for(int j=0;j<a[i].length;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.println("sum: "+result[i][j]);
    }
}
}
}