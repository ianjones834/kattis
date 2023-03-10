import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int h = input.nextInt();
    int k = input.nextInt();
    int v = input.nextInt();
    int s = input.nextInt();

    int distance = 0;

    while (h > 0) {
      v += s;
      v -= Math.max(1, v / 10);

      if (v >= k) {
        h++;
      }
      else if (0 < v && v < k) {
        h--;

        if (h == 0) {
          v = 0;
        }
      }

      if (v <= 0) {
        h = 0;
        v = 0;
      }

      distance += v;

      if (s > 0) {
        s--;
      }
    }

    System.out.println(distance);
    return;
  }
}