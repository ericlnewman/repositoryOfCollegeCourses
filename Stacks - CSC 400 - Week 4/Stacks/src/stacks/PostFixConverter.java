package stacks;

public class PostFixConverter  {
	
    /* A utility function to return precedence of a given operator
     * Higher returned value means higher precedence */ 
	static int precedence(char chr) {
		switch(chr) {
		case '+':
		case '-':
			return 1;
		case '/':
		case '*':
		case '%':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	String convertToPostfix(String expression) {
		// initializing empty string
		String result = new String("");
		// initializing empty stack
		LinkedStack<Character> stack = new LinkedStack<Character>();
		for(int i = 0; i < expression.length(); ++i) {
			char c = expression.charAt(i);
			/* if character that is scanned is an operand its added to the output */
			if(Character.isLetterOrDigit(c)) 
				result += c;
			/* if the scanned character is an '(', push it to the stack */
			else if(c == '(')
				stack.push(c);
			/* If the scanned character is an ')', pop and output from the stack until an '(' is encountered. */
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek()!= '(') {	// keep popping till opening bracket is found
		            result += stack.peek();
		            stack.pop();
				}
			stack.pop();
			} else {// an operator is encountered
		        while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {	// remove all higher precedence values
		            result += stack.peek();
		            stack.pop();
		        }
		        stack.push(c);
			}
		}
		// pop ( the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
            	result += stack.peek();
            	stack.pop();
		}
		return result;
	}
}

/*
 * 	Convert expressions to postfix
 * 
 * 	infix example is a + b ... each binary operator appears between its operands
 *  prefix example is + a b ... each binary operator appears before its operands
 *  postfix example is a b + ... each binary operator appears after its operands
 *  
 *  reason:
 *  both prefix and postfix expressions are simpler to process because they do not use
 *  precedence rules or parentheses. The precedence of an operator in either a prefix
 *  expression or a postfix expression is implied by the order in which the operators
 *  and operands occur in the expression.
 *  
 *  (a + b) * c is slower than the postfix    ab+c*
 *  a + b * c is slower than the postfix      abc *+
 *  a * b / (c-d) is slower than the postfix  ab * cd - /
 *  a / b + (c-d) is slower than the postfix  ab / cd -+
 *  a / b + c - d is slower than the postfix  ab / c + d -
 *  
 *  this is easily implemented with a stack, push the operands on the stack, then when
 *  an operand appears these are popped off the stack then the math with the operands
 *  is done using the operator. Then the result is pushed back on to the stack.
 */