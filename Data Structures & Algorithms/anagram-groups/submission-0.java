//import java.util.HashMap;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Create HashMap to store String & List<String>
        HashMap<String, List<String>> map = new HashMap<>();

        // 2. Iterate through string 
        for(String s: strs){

            // 3. Convert string to char array, sort array, and save as new string: key 
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            // 4. Check if map contains key
            if(!map.containsKey(key)){
                // 5. If not, create new key & add original string 
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            // 6. If yes, add the original string to the list 
            } else {
                map.get(key).add(s);
            }

        }

        

        // 7. Once loop is over return list of map values as new ArrayList 
        return new ArrayList<>(map.values());
        
    }
}
