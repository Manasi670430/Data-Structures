/*Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sum=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){

            int start=i+1;
            int end=nums.length-1;
            //System.out.println(nums[i]+","+nums[start]+","+nums[end]);

            while(start<end){
                if(nums[start]+nums[end]==(0-nums[i])){
                    sum.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                    start++; end--;
                }else if(nums[start]+nums[end]<(0-nums[i])){
                    start++;
                }else{
                    end--;
                }
                 
            }
            }
        }
        return sum;
        
    }
}
