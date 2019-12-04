import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Welcome in Guess the Number guessing game!");
        final int secretNumber = new Random().nextInt(100)+ 1;
        int userNumber = -1;
        do {
            userNumber = new Scanner(System.in).nextInt();
            if (userNumber > secretNumber) {
                System.out.println("Too high!")
            }
            if (userNumber < secretNumber) {
                System.out.println("Too low!")
            }
        } while (userNumber != secretNumber);

    }
}
