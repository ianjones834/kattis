import java.util.HashSet;
import java.util.Scanner;

public class magictrick {
  public static void main(String[] args) {
    HashSet<Character> set = new HashSet<Character>();
    Scanner input = new Scanner(System.in);

    String inString = input.nextLine();
    input.close();

    for (int i = 0; i < inString.length(); i++) {
      if (set.contains(inString.charAt(i))) {
        System.out.println(0);
        return;
      }

      set.add(inString.charAt(i));
    }

    System.out.println(1);
    return;
  }
}