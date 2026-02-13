package array;

// public class leader {
//     public static void main(String[] args) {
//         int[] a={10,120,50,77,100,60};
//         for(int i=0;i<a.length-1;i++){
//             boolean fo=true;
//             for(int j=i+1;j<a.length;j++){
//                 if(a[j]>a[i]){
//                     fo=false;
//                     break;
//                 }
//             }if(fo){
//             System.out.println(a[i]);
//             }
            
//         }
        
//     }
// }

public class leader {
    public static void main(String[] args) {
        int[] a={10,120,50,77,100,60};
        int max=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                max=a[i];
            System.out.println(" "+a[i]);
            }            
            }            
        }
        
    }
