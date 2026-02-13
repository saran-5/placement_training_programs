package two_D_array;

public class interchange {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9},{10,12,15}};
        for(int j=0;j<a[0].length;j++){
            int t=a[0][j];
            a[0][j]=a[a.length-1][j];
            a[a.length-1][j]=t;
        }
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
