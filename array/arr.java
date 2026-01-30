package array;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
