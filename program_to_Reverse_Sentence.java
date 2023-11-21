import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        String input = "data structures and algorithms";
        String reversed = reverseSentence(input);
        System.out.println("Original Sentence: " + input);
        System.out.println("Reversed Sentence: " + reversed);
    }

    public static String reverseSentence(String input) {
        String[] words = input.split(" ");

        Stack<String> wordStack = new Stack<>();

        for (String word : words) {
            wordStack.push(word);
        }   

        StringBuilder reversed = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversed.append(wordStack.pop());
            if (!wordStack.isEmpty()) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
