package array;

public class duplicate {
    public static void main(String[] args) {
        int[]a={1,2,2,3,3,3,5};
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
                while (i<a.length-1&&a[i]==a[i+1]){
                    i++;
                }               
            }            
        }System.out.println(count);
    }
}
// package array;

// public class duplicate {
//     public static void main(String[] args) {
//         int[]a={1,2,2,3,3,3,5};
    //     boolean[]v=new boolean[a.length];
    //     for(int i=0;i<a.length;i++){
    //         if(v[i]==true){
    //             continue;
    //         }
    //             int c1 =0;
    //             for(int j=i+1;j<a.length;j++){
    //                 if(a[i]==a[j]){
    //                     c1+=1;
    //                     v[j]=true;
    //                 }
    //             }
    //             if(c1>=2){
    //                 c1=1;
    //                 int c2=c1+c2;
    //             }

    //         }

    //     }
    // }

