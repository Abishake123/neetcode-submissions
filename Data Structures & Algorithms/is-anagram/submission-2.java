class Solution {
    public boolean isAnagram(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();


        if (sLen != tLen) {
            return false;
        }



        Map<Character, Integer> freq = new HashMap<>();


        for(int i = 0; i < sLen; i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0) + 1);
            freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i),0) - 1);
        }


        for(Integer fr : freq.values()){
            if(fr != 0){
                return false;
            }
        }

        return true;


    }
}
