class Solution {
    public int search(int[] nums, int target) {
        // Init low and high pointers 
        int low = 0;
        int high = nums.length - 1;

        // Traverse through the array 
        while (low <= high){
            // calculate mid index position 
            int mid = low + (high - low) / 2; 
            // check if target == mid index
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
}
