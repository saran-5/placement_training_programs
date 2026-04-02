public class r_rotate {
    public static void main(String[] args) {
        int []a={1, 2, 3, 4, 5};
        int r=4;
        int n=a.length;
        r=r%n;
        for(int i=0;i<r;i++){
            int l=a[n-1];
            for(int j=n-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0]=l;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
    }
}

