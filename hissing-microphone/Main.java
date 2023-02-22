import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
    input.close();

    if(str.contains("ss")) {
      System.out.println("hiss");
    }
    else {
      System.out.println("no hiss");
    }

    return;
  }
}