package two_D_array;

public class zigzag_snake {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            int r=i;
            int j=0;
            while(r>=0&&j<a.length) {
                System.out.print(a[r][j]);
                r--;
                j++;
            }
            System.out.println();
        }
            for(int j=1;j<a.length;j++){
                int i=j;
                int k=a.length-1;
                while(i<a.length&&k>=0) {
                System.out.print(a[i][k]+" ");
                i++;
                k--;
            }
            System.out.println();
            }
            
        }
}
