import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Pattern pattern = Pattern.compile("FBI");
    Matcher matcher;
    boolean flag = false;

    for (int i = 1; i <= 5; i++) {
      if (pattern.matcher(input.nextLine()).find()) {
        flag = true;
        System.out.print(i + " ");
      }
    }

    if (flag == false) {
      System.out.println("HE GOT AWAY!");
    }

    return;
  }
}