package prac;
import java.util.*;
public class lib {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n");
        int n= in.nextInt();
        int []s= new int[n];
        int top=-1;
        for(int i=0;i<n;i++){
            System.out.print("value: ");
            s[++top]=in.nextInt();
        }
        while(top>=0){
            System.out.print(s[top--]+" ");
        }
    }
}
