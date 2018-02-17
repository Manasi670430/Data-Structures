//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int aa[]=new int[2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        //1,2,4,3  -- 7
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                aa[0]=i;
                aa[1]=map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return aa;
        
        
    }
}
