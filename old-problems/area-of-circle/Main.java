import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double r = input.nextDouble();
    double m = input.nextDouble();
    double c = input.nextDouble();

    while (r > 0 && m > 0 && c > 0) {
      System.out.printf("%.5f %.5f\n", r * r * Math.PI, (c / m) * r * r * 4);

      r = input.nextDouble();
      m = input.nextDouble();
      c = input.nextDouble();
    }

    return;
  }
}