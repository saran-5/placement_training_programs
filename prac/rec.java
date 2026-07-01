package prac;
import java.util.*;
import java.util.List;

public class rec{
    // static int c(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     return n * c(n - 1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(c(5));
    // }





    //fatorial..

    // static boolean isPalindrome(String s, int start, int end) {
    //     if (start >= end)
    //         return true;
    //     if (s.charAt(start) != s.charAt(end))
    //         return false;
    //     return isPalindrome(s, start + 1, end - 1);
    // }
    // public static void main(String[] args) {
    //     String str = "madam";
    //     System.out.println(isPalindrome(str, 0, str.length() - 1));
    // }


    //power(a^b)..


    // static int c(int b, int p){
    //     if(p==0){
    //         return 1;
    //     }
    //     return b *c(b,p-1);
    // }
    // public static void main(String[] args) {
    //     int b=3;
    //     int p=2;
    //     System.out.println(c(b,p));
    // }


    // static void f(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println("start " + n);
    //     f(n-1);
    //     System.out.println("end "+ n);
    // }
    // public static void main(String[] args) {
    //     f(5);
    // }


    //decision tree
    // static void sub(int[] nums, int index,String current){
    //     if(index==nums.length){
    //         System.out.println(current);
    //         return;
    //     }
    //     sub(nums, index+1,current+nums[index]+" ");
    //     sub(nums, index+1, current);
    // }
    // public static void main(String[] args) {
    //     int [] nums = {1,2};
    //     sub(nums,0," ");
    // }


    //backtracking

    static void sub(int[] nums, int index, List<Integer> current){
        if(index==nums.length){
            System.out.println(current);
            return;
        }
        current.add(nums[index ]);
        sub(nums, index+1, current);
        current.remove(current.size()-1);
        sub(nums, index+1, current);
    }
    public static void main(String[] args) {
        int [] nums={1,2};
        sub(nums, 0, new ArrayList<>());
    }
}