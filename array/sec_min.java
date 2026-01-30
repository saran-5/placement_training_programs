package array;

public class sec_min {
    public static void main(String[] args) {
        int[] a={10,20,30,40,5};
        int min=a[0];
        int sec_min=a[0];
        for(int i=0;i<a.length;i++){
            
            if(a[i]<min){
                sec_min=min;
                min=a[i];
                
            }
            else if (a[i] < sec_min && a[i] != min) {
                sec_min = a[i];
            }
        }System.out.println("min"+min);
        System.out.println("sec_min"+sec_min);
    }
}
