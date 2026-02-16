package two_D_array;

public class zigzag_snake_another {
    
        public static void zigzag(int[][] matrix){
            int row=matrix.length;
            int col=matrix[0].length;
            for(int d=0;d<row+col-1;d++){
                if(d%2==0){
                    int r=(d<row)?d:row-1;
                    int c=d-r;
                    while (r>=0&&c<col) {
                        System.out.println(matrix[r][c]);
                        r--;
                        c++;
                    }
                }
            }
        }
    }

