package two_D_array;

public class spiral_rotation {
    public static void main(String[] args) {
        int[][]a={
        {1,2,3,4},
        {4,5,6,7},
        {7,8,9,10},
        {10,11,12,13}};
        int n=a.length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
