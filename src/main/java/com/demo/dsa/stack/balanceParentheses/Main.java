package com.demo.dsa.stack.balanceParentheses;

public class Main {
    /**
     *	Check to see if a string of parentheses is balanced or not.
     *	
     *	By "balanced," we mean that for every open parenthesis, 
     *	there is a matching closing parenthesis in the correct order. 
     *	For example, the string "((()))" has three pairs of balanced parentheses, 
     *	so it is a balanced string. On the other hand, the string "(()))" has an imbalance, 
     *	as the last two parentheses do not match, so it is not balanced.  
     *	Also, the string ")(" is not balanced because the close parenthesis needs to 
     *	follow the open parenthesis.
     *
     *	Your program should take a string of parentheses as input and return true 
     *	if it is balanced, or false if it is not.  In order to solve this problem, 
     *	use a Stack data structure.
     *
     *	Method name: isBalancedParentheses
     *	Return type: boolean
     *
     */
    public static boolean isBalancedParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c ==('(')){
                stack.push(c);
            }else if(c==(')')) {
            	if (stack.size() == 0) return false;
            	stack.pop();
            }
        }
        return stack.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(()";
        //String s3 = "(()())";
        String s3 =")(";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
    }
}
