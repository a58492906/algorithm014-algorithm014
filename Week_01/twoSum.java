 class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> result =new HashMap<>();
            result.put(nums[0],0);
         for(int i=1;i<=nums.length-1;i++){
             if (result.containsKey(target-nums[i])){
                 return new int[]{result.get(target-nums[i]),i};
             }
             result.put(nums[i],i);
         }
         return new int []{};
        }
    }