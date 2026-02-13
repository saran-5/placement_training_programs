package two_D_array;

public class mul {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,6,8},{1,2,3}};
        int[][]b={{4,2},{5,3},{1,6},{1,2}};
        int n=a.length;
        int p=a[0].length;
        int m=b[0].length;
        int[][]c=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for (int k=0;k<p;k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("mul matrix:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        
    }
}
}