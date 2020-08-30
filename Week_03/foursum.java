
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {

            List<List<Integer>> result = new ArrayList<>();

            if(nums==null||nums.length<4){
                return  result;
            }
            Arrays.sort(nums);
            int len =nums.length;

            for(int i=0;i<len-3;i++){
                if (i>0&&nums[i]==nums[i-1]){
                    continue;
                }


                int mini=nums[i]+nums[i+1]+nums[i+2]+nums[i+3];
                if(mini>target){
                    break;
                }
                int maxi=nums[i]+nums[len-3]+nums[len-2]+nums[len-1];
                if(maxi<target){
                    continue;
                }


                for(int k=i+1;k<len-2;k++){
                    if (k>i+1&&nums[k]==nums[k-1]){
                        continue;
                    }
                    int j=k+1;
                    int h=len-1;


                    int mink=nums[i]+nums[k]+nums[j]+nums[k+2];
                    if(mink>target){
                        break;
                    }
                    int maxk=nums[i]+nums[k]+nums[len-2]+nums[h];
                    if(maxk<target){
                        continue;
                    }
                    while (j<h){
                        int res=nums[i]+nums[k]+nums[h]+nums[j];
                        if (res==target){
                            result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[h]));
                            j++;
                            while(j<h&&nums[j]==nums[j-1]){
                                j++;
                            }
                            h--;
                            while(j<h&&i<h&&nums[h]==nums[h+1]){
                                h--;
                            }
                        }
                        else if (res>target){
                            h++;

                        }
                        else {
                            j++;
                        }


                    }
                }
            }

return  result;

        }
    }