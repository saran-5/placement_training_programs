package array;

public class product_arr_wo_itself {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        int n=a.length;
        int[] res = new int[n];
        int l=1,r=1;
        for (int i=0;i<n;i++) {
            res[i] =l;
            l=l*a[i];
            res[n-1-i]*=r;
            r=r*a[n-1-i];
        }

        for (int i=0;i<n;i++) {
            System.out.println(res[i]);
        }
        }
    }


