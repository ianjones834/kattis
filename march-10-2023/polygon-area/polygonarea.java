import java.util.Scanner;

public class polygonarea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    while (n != 0) {
      Polygon polygon = new Polygon();

      for (int i = 0; i < n; i++) {
        polygon.addPoint(new Point(scanner.nextInt(), scanner.nextInt()));
      }

      double area = polygon.getArea();

      if (area < 0) {
       System.out.printf("CW %.1f\n", -1 * area);
      }
      else {
        System.out.printf("CCW %.1f\n", area);
      }

      n = scanner.nextInt();
    }

    scanner.close();
    return;
  }
}