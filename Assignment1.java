import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Assignment1 {
  public static void main(String[] args) {
    int userInput,randomNum;
    final int BASE = 32;
    final double CONVERSION_FACTOR = 9.0 / 5.0;
    double fahrenheitTemp;
    double celsiusTemp;
    Random generator = new Random();
    String message,messagefirst, messagesecond, messagethird;


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Code for Initial
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    System.out.println("DDDDDDDDDDDDDDDDDD            MMMMMMMMMMMMMMMMMMMMMMMMMMM");
    System.out.println("DDDDDDDDDDDDDDDDDDDDD       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    System.out.println("DDDD           DDDDDD       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    System.out.println("DDD               DDDDD     MMMMMM     MMMMMMMMM     MMMMMM");
    System.out.println("DDD                DDDDD    MMMMM        MMMMMM       MMMMM");
    System.out.println("DDD                 DDDDD   MMMMM        MMMMMM       MMMMM");
    System.out.println("DDD                DDDDD    MM0MMM        MMMMMM       MMMMM");
    System.out.println("DDD               DDDDD     MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDD           DDDDDD       MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDDDDDDDDDDDDDDDDDDD       MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDDDDDDDDDDDDDDDDD         MMMMM        MMMMMM       MMMMM");
    System.out.println('\n');

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Code for Users input
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a 5-character string:");

    message = scan.nextLine();

    messagefirst = message.substring(3,4);
    messagesecond = message.substring(2,3);
    messagethird = message.substring(1,2);

    System.out.println("Please enter a number in Fahrenheit:");

    userInput = scan.nextInt();

    fahrenheitTemp = userInput;

    celsiusTemp = (fahrenheitTemp -BASE)* CONVERSION_FACTOR;

    System.out.println("Random number generated. Continuing...: ");

    randomNum = generator.nextInt(16384)+ 32;

    System.out.println("Your new string is: " + celsiusTemp + messagefirst + messagesecond + messagethird + randomNum);

    scan.close();
  }
}
