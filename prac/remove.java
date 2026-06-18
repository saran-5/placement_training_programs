package prac;

public class remove {
    public static void main(String[] args){
        Solution s = new Solution();
        int []nums={1,234,3};
        int k= s.removeElement(nums,1);
        System.out.println("len "+k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}