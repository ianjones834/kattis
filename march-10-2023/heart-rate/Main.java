import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();

    while (N-- > 0) {
      int b = input.nextInt();
      double p = input.nextDouble();

      double BPM = 60.0 * b / p;
      double error = 60.0 / p;

      System.out.printf("%.4f %.4f %.4f\n", BPM - error, BPM, BPM + error);
    }

    input.close();

    return;
  }
}