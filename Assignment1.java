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
    System.out.println("DDD                DDDDD    MMMMM        MMMMMM       MMMMM");
    System.out.println("DDD               DDDDD     MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDD           DDDDDD       MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDDDDDDDDDDDDDDDDDDD       MMMMM        MMMMMM       MMMMM");
    System.out.println("DDDDDDDDDDDDDDDDDDD         MMMMM        MMMMMM       MMMMM");
     System.out.println();

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Code for Users input
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a 5-character string: ");

    message = scan.nextLine();

    if (message.length() > 5 || message.length() > 5) {
      System.out.println("Input either exceeds or is below 5 characters.");
    }


    System.out.println();

    messagefirst = message.substring(3,4);
    messagesecond = message.substring(2,3);
    messagethird = message.substring(1,2);

    System.out.print("Please enter a number in Fahrenheit: ");

    userInput = scan.nextInt();
    System.out.println();

    fahrenheitTemp = userInput;

    celsiusTemp = (fahrenheitTemp -BASE)* CONVERSION_FACTOR;

    System.out.println("Random number generated. Continuing...");
    System.out.println();

    randomNum = generator.nextInt(16384)+ 32;

    System.out.println("Your new string is: " + celsiusTemp + messagefirst + messagesecond + messagethird + randomNum);
    System.out.println();

    scan.close();
    }
  }
