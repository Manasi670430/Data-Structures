/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

//In first reverse I rotated the complete array -- 7,6,5,4,3,2,1
//Now in second reverse call i rotated the first half array 7,6,5 to  5,6,7
//Now in the third half i rotated the remaining half array 4,3,2,1 to 1 2 3 4
// Solution :  5,6,7,1,2,3,4

class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;
            end--;
        }
    }
}
