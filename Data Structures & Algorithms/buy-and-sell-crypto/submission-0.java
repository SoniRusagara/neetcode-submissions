class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // Have a min so far 
        int buy = prices[0];
        // Sliding window i = 1 
        for(int i = 1; i < prices.length; i++){
            // check if i is less than min if so thats the new min 
            if(prices[i] < buy) { 
                buy = prices[i];
            } else {
                // do j - i to find the differnce 
                int diff = prices[i] - buy;
                if(diff > profit) { profit = diff; }
            }
        }
        // after loop return that diff 
        return profit;
        
    }
}
