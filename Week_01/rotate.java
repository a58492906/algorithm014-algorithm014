   class Solution {
       
        public static void rotate(int[] nums, int k) {
            int temp;
            int  result;
            for (int i=0;i<k;i++){
                  result =nums[nums.length-1];
                for (int j=0;j < nums.length; j++){
                    temp =nums[j];
                    nums[j] = result;
                    result =temp;
               

            }


        }


}


        }
    