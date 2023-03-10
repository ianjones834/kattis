import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Integer> intStack = new Stack<Integer>();

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    for (int i = 0; i < n; i++) {
      intStack.push(input.nextInt());
    }

    for (int i = 0; i < n; i++) {
      System.out.println(intStack.pop().intValue());
    }

    return;
  }
}