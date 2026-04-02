package tcs_2;

public class max {
    public static void main(String[] args) {
        int[]a={7,4,8,2,9};
        int count=1;
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                count++;
                max=a[i];
            }
        }
        System.out.println(count);
    }
}
