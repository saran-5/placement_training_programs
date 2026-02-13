package two_D_array;

public class transpose {
    public static void main(String[] args) {
        int[][]a={{5,6},{2,3}};
        int transpose[][]=new int [a[0].length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                transpose[j][i]=a[i][j];
            }

        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println();
        }
    }
}
