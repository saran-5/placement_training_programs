public class rotate {
    public static void main(String[] args) {
        int []a={1,2,3};
        int r=4;
        int n=a.length;
        r=r%n;
        for(int i=0;i<r;i++){
            int first=a[0];
            for(int j=0;j<n-1;j++){
                a[j] = a[j+1];
            }
            a[n-1] = first;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        }
    }

