import java.util.Stack;

public class SplitSentence {
    public static void main(String[] args) {
        String input = "data structures and algorithms";
        
        System.out.println("Original Sentence: " + input);
        splitSentence(input);
        
    }

    public static void splitSentence(String input) {
        String[] words = input.split(" ");

        Stack<String> wordStack = new Stack<>();

        for (String word : words) {
            wordStack.push(word);
        } 

        
            System.out.print(wordStack+ " ");
           

        }
}
