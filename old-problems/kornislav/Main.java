import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int lengths[] = new int[4];

    for (int i = 0; i < 4; i++) {
      lengths[i] = input.nextInt();
    }

    Arrays.sort(lengths);
    System.out.println(lengths[0] * lengths[2]);

    return;
  }
}