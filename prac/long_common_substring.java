package prac;
import java.util.*;
public class long_common_substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1: ");
        String s1=in.nextLine();
        System.out.println("enter 2: ");
        String s2=in.nextLine();
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        int maxl=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    maxl=Math.max(maxl, dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        System.out.print(maxl);
    }
}
