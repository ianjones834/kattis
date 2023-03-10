import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int nums[] = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }

    for (int i = n - 1; i >= 0; i--) {
      System.out.println(nums[i]);
    }

    return;
  }
}