import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Welcome in Guess the Number guessing game!");
        final int secretNumber = new Random().nextInt(10)+ 1;
        int userNumber = -1;
        do {
            userNumber = new Scanner(System.in).nextInt();
        } while (userNumber != secretNumber);

    }
}
