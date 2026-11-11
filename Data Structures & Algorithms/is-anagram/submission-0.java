class Solution {
    public boolean isAnagram(String s, String t) {
        // Create frequency map 
        HashMap<Character, Integer> freqMap = new HashMap<>();
     
        for(int i = 0; i < s.length(); i++){
            // if freqMap doesnt contain the character i, 
            if(!freqMap.containsKey(s.charAt(i))){
                // then we add the character with value 1
                freqMap.put(s.charAt(i), 1);
            } else {
                // else we increment the value by 1 
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i)) + 1);
            }
        }

        // Check if t has the same characters as s 
        for (int j = 0; j < t.length(); j++){
            if(!freqMap.containsKey(t.charAt(j))){
                // return false (early stop)
                return false;
            } else {
                // subtract 1 from that character
                freqMap.put(t.charAt(j), freqMap.get(t.charAt(j)) - 1);

                // if it reaches 0 we remove it from freqMap
                if (freqMap.get(t.charAt(j)) == 0){
                    freqMap.remove(t.charAt(j));
                }
            }
        }
        return freqMap.isEmpty();

    }
}
