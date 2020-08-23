class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (!(nums.length >0) ||k==0){
            return nums;
        }
        int [] result = new int [nums.length-k+1] ;
        int maxInd = -1, max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            if (maxInd>=i){
                if (nums[i+k-1]>max){
                    max=nums[i+k-1];
                    maxInd=i+k-1;
                }

            }else {
                max=nums[i];{
                    for (int j=i;j<i+k;j++){
                        if (max<nums[j]){
                            max=nums[j];
                            maxInd=j;
                        }
                    }

                }
            }
                result[i]=max;

        }

        return  result;
    }
}