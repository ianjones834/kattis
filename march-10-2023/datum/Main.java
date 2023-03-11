import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    Scanner scanner = new Scanner(System.in);

    int day = scanner.nextInt();
    int month = scanner.nextInt() - 1;


    calendar.set(2009, month, day);
    int dayNum = calendar.get(Calendar.DAY_OF_WEEK);

    switch (dayNum) {
      case 1: {
        System.out.println("Sunday");
        break;
      }
      case 2: {
        System.out.println("Monday");
        break;
      }
      case 3: {
        System.out.println("Tuesday");
        break;
      }
      case 4: {
        System.out.println("Wednesday");
        break;
      }
      case 5: {
        System.out.println("Thursday");
        break;
      }
      case 6: {
        System.out.println("Friday");
        break;
      }
      case 7: {
        System.out.println("Saturday");
        break;
      }
    }

    return;
  }
}