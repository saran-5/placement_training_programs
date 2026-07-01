package prac;
public class climb{
    public static void main(String[]args){
        int n=6;
        System.out.println(c(n));
    }
    public static int c(int n){
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }
        return c(n-1)+c(n-2);
    }
    // public static void main(String[]args){
    //     int n=6;
    //     System.out.println(c(n));
    // }
    // public static int c(int n){
    //     if(n<=2){
    //         return 2;
    //     }
    //     int prev2=1,prev1=2;
    //     for(int i=3;i<=n;i++){
    //         int curr=prev1+prev2;
    //         prev2=prev1;
    //         prev1=curr;
    //     }
    //     return prev1;
    // }
}