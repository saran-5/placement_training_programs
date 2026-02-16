package two_D_array;
import java.util.*;
public class rotaion_with_equalent_rows {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][]a={{1,2,3,4},{4,3,1,2},{5,6,7,8},{7,6,3,1}};
        for(int r=0;r<a.length;r++){
            int n=a[r].length;
            int k=r%n;
            int[] temp=new int[k];
        for (int i=0;i<k;i++) {
                temp[i]=a[r][i];
            }
        for(int i=k;i<n;i++){
            a[r][i-k]=a[r][i];
        }
        for(int i=0;i<k;i++){
            a[r][n-k+i]=temp[i];
        }
        
}
for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
}
}


