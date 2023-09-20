// My attempt at my initials

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

    System.out.println("DDDDDDDDDDDDDDDDDD            DDDDDDDDDDDDDDDDDDDDDDDDDDD");
    System.out.println("DDDDDDDDDDDDDDDDDDDDD       DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    System.out.println("DDDDD            DDDDDD     DDDDDD       DDDDDDD     DDDDDD");
    System.out.println("DDD                DDDDD    DDDDD         DDDDD       DDDDD");
    System.out.println("DDD                DDDDD    DDDDD         DDDDD       DDDDD");
    System.out.println("DDD                DDDDD    DDDDD         DDDDD       DDDDD");
    System.out.println("DDD                DDDDD    DDDDD         DDDDD       DDDDD");
    System.out.println("DDD                DDDDD    DDDDD         DDDDD       DDDDD");
    System.out.println("DDDDD            DDDDDD     DDDDD         DDDDD       DDDDD");
    System.out.println("DDDDDDDDDDDDDDDDDDDDD       DDDDD         DDDDD       DDDDD");
    System.out.println("DDDDDDDDDDDDDDDDDDD         DDDDD         DDDDD       DDDDD\n");

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Please enter 5-character string
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

      
  
      double fahrenheitTemp;
      int celsiusTemp = 24;  // value to convert
  
      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
  
      System.out.println("Celsius Temperature: " + celsiusTemp);
      System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);


  }
}
