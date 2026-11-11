

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++){
            int neededNum = target - nums[i];

            if(map.containsKey(neededNum)){
                return new int[] {map.get(neededNum), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
        
    }
}
