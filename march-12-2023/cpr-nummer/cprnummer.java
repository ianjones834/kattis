import java.util.Scanner;

public class cprnummer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String cprNumber = scanner.nextLine();

    int factor[] = {4, 3, 2, 7, 6, 5, 0, 4, 3, 2, 1};
    int sum = 0;

    for (int i = 0; i < cprNumber.length(); i++) {
      if (cprNumber.charAt(i) == '-') {
        continue;
      }

      sum += Integer.parseInt(cprNumber.charAt(i) + "") * factor[i];
    }

    if (sum % 11 == 0) {
      System.out.println(1);
      return;
    }

    System.out.println(0);

    scanner.close();
    return;
  }
}