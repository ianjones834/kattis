import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int count = 0;

    int flights[][] = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        flights[i][j] = input.nextInt();

        if (flights[i][j] != -1) {
          count++;
        }
      }
    }

    System.out.println(count);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (flights[i][j] != -1) {
          System.out.printf("%d %d %d\n", i + 1, j + 1, flights[i][j]);
        }
      }
    }

    return;
  }
}