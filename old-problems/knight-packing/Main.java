import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();


    if (n % 2 == 1) {
      System.out.println("first");
    }
    else {
      System.out.println("second");
    }

    return;
  }
}