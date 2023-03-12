import java.util.Scanner;

public class ratingproblems {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();

    int givenSum = 0;

    for (int i = 0; i < k; i++) {
      givenSum += scanner.nextInt();
    }

    scanner.close();

    int minSum = givenSum;
    int maxSum = givenSum;

    for (int i = 0; i < n - k; i++) {
      minSum += -3;
      maxSum += 3;
    }

    System.out.printf("%.4f %.4f", minSum / (double ) n, maxSum / (double) n);
    return;
  }
}