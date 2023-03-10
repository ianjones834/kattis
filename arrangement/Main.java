import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int M = input.nextInt();

    ArrayList<StringBuilder> rooms = new ArrayList<StringBuilder>();

    for (int i = 0; i < N; i++) {
      rooms.add(new StringBuilder());
    }

    for (int i = 0; i < M; i++) {
      rooms.get(i % N).append('*');
    }

    for (int i = 0; i < N; i++) {
      System.out.println(rooms.get(i).toString());
    }

    return;
  }
}