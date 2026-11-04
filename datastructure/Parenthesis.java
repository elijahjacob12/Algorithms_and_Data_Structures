
package edu.sdsu.cs160l.datastructure;

import java.util.Stack;

public class Parenthesis {
    /**
     * @param brackets contains a sequence of Characters '(' or ')'
     * @return true if the brackets are balanced else false
     */
    public boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // closing with no opening available
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // leftover openings mean unbalanced; empty string is balanced
    }
}
