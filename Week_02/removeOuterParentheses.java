class Solution {
        public String removeOuterParentheses(String S) {
        Integer len =S.length();
        int  index=0;
            int num=0;
            StringBuilder sb = new StringBuilder();
            for (int i =0;i<len;i++){
                if(S.charAt(i)=='('){
                    num++;
                }
                if(S.charAt(i)==')'){
                    num--;
                }

                if(num==1&&S.charAt(i)=='('){
                    index=i;
                }
                if (num==0){
                    sb.append(S.substring(index+1,i));
                }


            }
            return  sb.toString();

        }
    }