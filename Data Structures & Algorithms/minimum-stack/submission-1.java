class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        // Check if stacks are empty (should it be and or just minstack)
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    

    // void pop() removes the element on the top of the stack
    public void pop() {
        // use peek from the max stack to see if it equals the value to be popped from main stack
            // if it is then we also pop from the main stack
        if(stack.peek().equals(minStack.peek())){
        minStack.pop();
        }

        stack.pop();

    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
