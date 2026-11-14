class KthLargest {
    // 1. Init Priority Queue to store kth largest numbers 
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    // 2. Declare var for k
    int k;

    public KthLargest(int k, int[] nums) {
        // 3. Init k 
        this.k = k;

        // 4. Add nums to minHeap 
        for(int num: nums){
            minHeap.add(num);
            // 4.1. Limit minHeap to size k 
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }  
    }
    
    public int add(int val) {
        // 5. Add val onto minHeap 
        minHeap.add(val);

        // 6. Limit minHeap to size k 
        if(minHeap.size() > k){
            minHeap.poll();
        }

        // 7. Return minHeap.peek()
        return minHeap.peek();
        
    }
}
