package array;

public class deletion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int deleteIndex = 2; // index of the element to be deleted
        int[] b = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != deleteIndex) {
                b[j++] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
