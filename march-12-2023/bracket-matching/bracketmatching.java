import java.util.Scanner;
import java.util.Stack;

public class bracketmatching {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Character> bracketStack = new Stack<Character>();

    int n = scanner.nextInt();
    String inputString = scanner.next();

    for (int i = 0; i < n; i++) {
      bracketStack.push(inputString.charAt(i));

      char topChar = bracketStack.peek();

      if (topChar == ')' || topChar == ']' || topChar == '}') {
        bracketStack.pop();

        char nextChar = bracketStack.peek();

        String bracketSequence = "" + nextChar + topChar;

        if (bracketSequence.equals("()") || bracketSequence.equals("[]") || bracketSequence.equals("{}")) {
          bracketStack.pop();
        }
      }
    }

    if (bracketStack.isEmpty() == true) {
      System.out.println("Valid");
      return;
    }

    System.out.println("Invalid");
    return;
  }
}