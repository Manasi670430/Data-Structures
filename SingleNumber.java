//Given an array of integers, every element appears twice except for one. Find that single one.


class Solution {
    public int singleNumber(int[] nums) {
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
         //1 2 3 1 2
         c=c^nums[i];
        
        }
        return c;
    }
}
