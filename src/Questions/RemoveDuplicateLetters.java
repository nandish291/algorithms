package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveDuplicateLetters {
  public static String removeDuplicateLetters(String s) {
    Map<Character, Integer> lastOccurrence = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      lastOccurrence.put(s.charAt(i), i);
    }

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (stack.contains(c)) continue;
      while (!stack.isEmpty() && c < stack.peek() && i < lastOccurrence.get(stack.peek())) {
        stack.pop();
      }
      stack.push(c);
    }

    StringBuilder result = new StringBuilder();
    for (char c : stack) {
      result.append(c);
    }
    return result.toString();
  }

  public static void main(String[] args) {
    String s = "bcabc";
    String result = removeDuplicateLetters(s);
    System.out.println(result); // Output should be "abc"
  }
}
