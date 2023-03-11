import java.util.Scanner;

public class combinationlock {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int starting = scanner.nextInt();
    int first = scanner.nextInt();
    int second = scanner.nextInt();
    int third = scanner.nextInt();

    while (starting != 0 || first != 0 || second != 0 || third != 0) {
      int degrees = 720;

      if (starting < first) {
        degrees += (40 - (first - starting)) * 9;
      }
      else if (starting > first) {
        degrees += (starting - first) * 9;
      }

      degrees += 360;

      if (first < second) {
        degrees += (second - first) * 9;
      }
      else if (first > second) {
        degrees += (40 - (first - second)) * 9;
      }

      if (second < third) {
        degrees += (40 - (third - second)) * 9;
      }
      else if (second > third) {
        degrees += (second - third) * 9;
      }

      System.out.println(degrees);

      starting = scanner.nextInt();
      first = scanner.nextInt();
      second = scanner.nextInt();
      third = scanner.nextInt();
    }

    scanner.close();
    return;
  }
}