package prac;

public class bin {
    static int bin(int [] arr, int key){
        int l=0;
        int h=arr.length-1;
        int ans = arr.length;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]>=key){
                ans= m;
                h= m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,4,4,5,7};
        System.out.println(bin(arr, 4));
    }
}
