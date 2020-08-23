class Solution {
    public boolean isAnagram(String s, String t) {


        if (s.equals(t)) {
            return true;
        }
        int len = s.length();
        if (len != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Character c : sMap.keySet()) {
            if (!tMap.containsKey(c)) {
                return false;
            }
            if (!tMap.get(c).equals(sMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}