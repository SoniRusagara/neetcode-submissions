class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Init longest streak variable 
        int longestStreak = 0;

        // 2. Init & Populate hashset 
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        // 3. Iterate through the set & check if it is the first number in the set 
        for(int num: set){
            if(!set.contains(num - 1)){
                int currNum = num; 
                int currStreak = 1;

                // 4. If it is the first number, then while the next number is within the set increment the count and curr num 
                while(set.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }
                // 5. Update the longest streak 
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        // 6. Once loop is over, return the longest streak 
        return longestStreak;
        
    }
}
