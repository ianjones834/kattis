import java.util.Scanner;

public class buildinghighways {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int costs[] = new int[n];

    int minCost = Integer.MAX_VALUE;
    int minIndex = 0;

    for (int i = 0; i < n; i++) {
      costs[i] = scanner.nextInt();

      if (costs[i] < minCost) {
        minCost = costs[i];
        minIndex = i;
      }
    }

    long total = 0;

    for (int i = 0; i < n; i++) {
      if (minIndex == i) {
        continue;
      }

      total += costs[minIndex] + costs[i];
    }

    System.out.println(total);
    scanner.close();
    return;
  }
}