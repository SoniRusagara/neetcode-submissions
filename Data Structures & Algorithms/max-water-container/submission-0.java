

class Solution {
    public int maxArea(int[] heights) {
        // Create two pointers & max var 
        int i = 0; 
        int j = heights.length - 1; 
        int max = 0;

        // Iterate through array while left < right
        while (i < j){
            // Calculate area 
            int height = Math.min(heights[i], heights[j]);
            int width = j - i;
            int area = height * width;
            // Check if area > max 
            if (area > max) { max = area; } // if so update running max 
                
            // Check which value is min btwn i & j 
            if (heights[i] < heights[j]) {
                // if left smaller: i++
                i++;
            } else {
                // if right smaller or equal: j--
                j--;
            }
        } 
        // Once while loop is finished return max 
        return max;
    }
}
