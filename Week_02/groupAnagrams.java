class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (String s :strs){
            char[] character=s.toCharArray();
            Arrays.sort(character);
            String key =String.valueOf(character);
            if (map.containsKey(key)){
                List<String> temps= map.get(key);
                temps.add(s);
                map.put(key,temps);
            }
            else {
                
                List<String> temps= new ArrayList<>();
                temps.add(s);
                map.put(key,temps);
            }
        }
        for(String s:map.keySet()){
            res.add(map.get(s));
        }
return  res;


    }


}