// My attempt at my initials

import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Assigning Variables
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    int num1;
    float num2;

    //From TempConverter

     final int BASE = 0;
    final double CONVERSION_FACTOR = 9.0 / 5.0;
    double fahrenheitTemp;
      int celsiusTemp = 0;  // value to convert
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
    System.out.println('\n');

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Code for Users input
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    String message;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number in Fahrenheit:");

    message = scan.nextLine();

    System.out.println("Please enter a 5-character string:");

    message = scan.nextLine(); 


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Random Number Genera
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Random generator = new Random();
    
    num1 = generator.nextInt(16384);
    num2 = generator.nextFloat();

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Trying to Combine input into string result
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

      System.out.println("Random number generated. Continuing...: ");
      System.out.println("Your new string is: "+fahrenheitTemp + celsiusTemp  + message + num1 );
      // System.out.println("" + message + "");
    scan.close();
  }
}
