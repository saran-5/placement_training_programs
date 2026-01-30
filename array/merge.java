package array;

public class merge {
    public static void main(String[] args) {
        int[]a={1,2,4};
        int[]b={2,4,5};
        int d=0;
        int []c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[d++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[d++]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
