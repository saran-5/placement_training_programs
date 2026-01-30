package array;

public class even_odd_count {
    public static void main(String[] args) {
        int[] a={10,21,32,43,54,65,76};
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count: "+even);
        System.out.println("Odd count: "+odd);
    }
}