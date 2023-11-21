import java.util.*;

class infix_to_postfix {
	static int Prec(char ch)
	{
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	
	static String infixToPostfix(String exp)
	{
		String result = new String("");
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < exp.length(); ++i) {
			char c = exp.charAt(i);
			if (Character.isLetterOrDigit(c))
				result = result + c;
				
			else if (c == '(')
				stack.push(c);

			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result = result + stack.peek();
					stack.pop();
				}

				stack.pop();
			}
			
			else
			{
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {

					result = result + stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			if (stack.peek() == '(')
				return "Invalid Expression";
			result = result + stack.peek();
			stack.pop();
		}
		                          //harsha22csu081
		return result;
	}

	public static void main(String[] args)
	{
		String exp = "a+b-c";
		System.out.println("infix expression - " +exp);
		System.out.println("postfix expression - " +infixToPostfix(exp));
	}
}
