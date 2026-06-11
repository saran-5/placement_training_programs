package prac;

public class ch {
    public static void main(String[] args) {
        int []a={1,2,3,4,6,7,9};
        char[]b={'b','c'};
        String[]c={"hello"};
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        int [][]aa={{1,2},{2,3}};
        for(int i=0;i<aa.length;i++){
            for(int j=0;j<aa.length;j++){
                System.out.println(aa[i][j]);
            }
        }
        char [][]bb={{'d','c'},{'m','c','u'}};
        for(int i=0;i<bb.length;i++){
            for(int j=0;j<bb[i].length;j++){
                System.out.println(bb[i][j]);
            }
        }
        String [][]cc={{"hi"},{" hello"}};
        for(int i=0;i<cc.length;i++){
            for(int j=0;j<cc[i].length;j++){
                System.out.print(cc[i][j]);
            }
        }

    }
}
