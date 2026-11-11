class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create hashset 
        Set<Integer> uniqueSet = new HashSet<>();

        // if nums[i] cant be put in the hashset then we return true
        for(int num : nums){
            if(!uniqueSet.add(num)){
                return true;
            } else {
                uniqueSet.add(num);
            }
        }

        // after loop return false
        return false;

        
    }
}