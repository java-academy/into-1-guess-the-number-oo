package ja.workshops.gtn;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/** @author Marcin Ogorzałek */
class App {
  public static void main(String[] args) {
    System.out.println("Number if from range 1 to 100");
    int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
    int guess = -1;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter a number");
      String userInput = scanner.next();
      try {
        guess = Integer.parseInt(userInput);
      } catch (NumberFormatException e) {
        System.err.println("You have to enter a number!");
      }
      if (guess < randomNumber) {
        System.out.println("Number is too low!");
      } else if (guess > randomNumber) {
        System.out.println("Number is too high!");
      }
    } while (randomNumber != guess);
    System.out.println("Correct! That’s the number!");
  }
}
