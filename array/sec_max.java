package array;

public class sec_max {
    public static void main(String[] args) {
        int[] a={10,-20,40,-30,5};
        int max=a[0];
        int sec=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                sec=max;
                max=a[i];
            }
            else if (a[i] > sec && a[i] != max) {
                sec = a[i];
            }
        }System.out.println("max "+max);
        System.out.println("sec max "+sec);   
    }
}
