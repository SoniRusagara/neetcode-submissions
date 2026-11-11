class Solution {
    public int evalRPN(String[] tokens) {
        // init stack 
        Stack<Integer> stack = new Stack<>();

        // iterate through the string array 
        for (int i = 0; i < tokens.length; i++){
            // for each character check if it is one of the 
            // operators 
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                // if it is an operator then we 
                //1. check if the stack is empty 
                if (stack.isEmpty()){
                    // if yes return -1 & that no numbers etc
                    return -1;
                } else {
                    // if not empty, we pop twice (to get the first two items)
                    int scndVal = stack.pop();
                    int firstVal = stack.pop();
                    // then perform that operation on them
                    if(tokens[i].equals("+")){
                        int result = firstVal + scndVal;
                        // save result & push result to stack
                        stack.push(result);
                    } else if (tokens[i].equals("-")){
                        int result = firstVal - scndVal;
                        stack.push(result);
                    } else if (tokens[i].equals("*")){
                        int result = firstVal * scndVal;
                        stack.push(result);
                    } else if (tokens[i].equals("/")){
                        int result = firstVal / scndVal;
                        stack.push(result);
                    }
                }
            } else {
                // if it is not an operater then we
                //1. push the number to the stack 
                int n = Integer.parseInt(tokens[i]);
                stack.push(n);

            }
        }
        // after loop return the result
        return stack.pop();
        
    }
}
