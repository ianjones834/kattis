import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String cards = input.nextLine();

    int tCount = 0;
    int cCount = 0;
    int gCount = 0;



    for (int i = 0; i < cards.length(); i++) {
      char cur = cards.charAt(i);

      if (cur == 'T') {
        tCount++;
      }

      else if (cur == 'C') {
        cCount++;
      }
      else if (cur == 'G') {
        gCount++;
      }
    }

    int tScore = tCount * tCount;
    int cScore = cCount * cCount;
    int gScore = gCount * gCount;
    int bonus = 7 * Math.min(tCount, Math.min(cCount, gCount));

    int total = tScore + cScore + gScore + bonus;

    System.out.println(total);
    input.close();

    return;
  }
}