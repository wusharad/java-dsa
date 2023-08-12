package com.demo.dsa.stack.sortStack;

public class Main {
	
    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> sortedStack = new Stack<>();
        while(stack.size() != 0 ){
            Integer temp = stack.pop();
                while(sortedStack.size()!=0 && temp < sortedStack.peek()){
                    stack.push(sortedStack.pop());
                }
                sortedStack.push(temp);
        }
        
        while(sortedStack.size() != 0){
            stack.push(sortedStack.pop());
        }

    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }

}

