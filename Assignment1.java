// My attempt at my initials

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Assigning Variables
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // From Echo
    final int BASE = 32;
    final double CONVERSION_FACTOR = 9.0 / 5.0;
    
    //From TempConverter
    double fahrenheitTemp;
      int celsiusTemp = 24;  // value to convert

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
    System.out.println("DDDDDDDDDDDDDDDDDDD         MMMMM        MMMMMM       MMMMM\next");

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Code for Enter a 5-character string
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    String message;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number in Fahrenheit:");

    message = scan.nextLine();

    System.out.println("You entered: \"" + message + "\"");
    scan.close();

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Converter
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
  
      System.out.println("Celsius Temperature: " + celsiusTemp);
      System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

  }
}
