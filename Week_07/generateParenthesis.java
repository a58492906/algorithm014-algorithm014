class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res=new ArrayList<>();
            generateParenthesisHelper(0,0,n,res,"");
            return  res;

        }

            void generateParenthesisHelper(int left,int right,int n ,List<String> res,String s){
               if (left==n&&right==n){
                    res.add(s);
                    return;
                }

                   if(left<n){
                  generateParenthesisHelper(left+1,right,n,res,s+"(");
                  }
                  if(left>right){
                    generateParenthesisHelper(left,right+1,n,res,s+")");
                }
            }

    }