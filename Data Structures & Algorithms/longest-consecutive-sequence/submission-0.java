class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Init var for longest streak 
        int longestStreak = 0;

        // 2. Init & Populate HashSet 
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        // 3. Iterate through set and check if the current num is the first on in the set 
        for(int num: set){
            if(!set.contains(num - 1)){
                // 4. If it is, then we init currStreak and currNum variables
                int currStreak = 1;
                int currNum = num;

                // 5. Enter while loop that remains valid as long as the currNum + 1 number is within the hashset 
                while(set.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }
                // 5.1 Compare longestStreak vs currStreak 
                longestStreak = Math.max(longestStreak, currStreak);


            }
        }

             

            

            

        // 6. Once while loop is over return longest streak  
        return longestStreak;
        
    }
}
