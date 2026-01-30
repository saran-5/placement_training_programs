package array;

public class reverse {
    public static void main(String[] args) {
        int []a={10,20,23,20};
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("reverse: ");
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }

    }
}
