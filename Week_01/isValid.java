 class Solution {
        public boolean isValid(String s) {
            if (s == null) {
                return false;
            }
            int len = s.length();
            if (len % 2 != 0) {
                return false;
            }
            Map<Character, Character> pairs = new HashMap<>();
            pairs.put(')', '(');
            pairs.put(']', '[');
            pairs.put('}', '{');
            Stack<Character> st = new Stack<Character>();
            for (int i=0;i<s.length();i++){
                char a= s.charAt(i);
                if (pairs.containsKey(a)){
                    if(st.empty()||st.peek()!=pairs.get(a)){
                        return false;
                    }
                    st.pop();
                }      else{
                st.push(a);}
            }
            return st.isEmpty();

        }
    }