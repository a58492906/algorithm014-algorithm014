class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if(nums1.length>nums2.length){
                return intersect(nums2,nums1);
            }
            int [] result =  new int[nums1.length];
            Map<Integer ,Integer> nums1map=new HashMap<>();
            for (int num : nums1) {
                int count = nums1map.getOrDefault(num, 0) + 1;
                nums1map.put(num, count);
            }
          
            int  index=0;
            for (int num:nums2){
                int count = nums1map.getOrDefault(num, 0);
                if (count>0){
                    result[index++]=num;
                    count--;
                    if (count>0){
                        nums1map.put(num,count);
                    }
                    else{
                        nums1map.remove(num);
                    }
                }

            }
            return  Arrays.copyOfRange(result,0,index);
        }
    }