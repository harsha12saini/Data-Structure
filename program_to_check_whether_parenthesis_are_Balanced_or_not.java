import java.util.Stack;

public class Balanced_Parenthesis {
    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') 
                stack.push(ch);
             
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;  
                }
                
                char c = stack.pop();
                if ((ch == ')' && c != '(') || (ch == '}' && c != '{') || (ch == ']' && c != ']')) {
                    return false;  
                }
            }
        }
        return stack.isEmpty(); 
    }   //harsha22csu081

    public static void main(String[] args) {
        String str = "(a+b))*c";
        if (areParenthesesBalanced(str)) 
            System.out.println("Parentheses Balanced");
         else 
            System.out.println("Parentheses Not Balanced");
        
    }
}
