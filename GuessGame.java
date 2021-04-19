

import java.util.Random;
import java.util.Scanner;

/**
 * @author Omkar
 * @since  2021-04-18
 * @version 1.0
 */

public class GuessGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess Game!");
        System.out.print("Enter your Name: ");

        //Initialized a Scanner variable to take various inputs
        Scanner input = new Scanner(System.in);

        String Name = input.next();
        System.out.println("Hello " + Name);
        System.out.println("Should we begin the game: ");
        System.out.println("1.Yes \n2.No");
        int bool = input.nextInt();
        boolean shallBegin = false;
        boolean start = true;

        int reelNumber = 0;
        int realNumber;
        int timesTried = 0;

        Random random = new Random();
        realNumber = random.nextInt(20) + 1;

        while(start) {
            if (bool == 1) {
                shallBegin = true;
                while (shallBegin) {
                    timesTried++;
                    System.out.print("Guess the number: ");
                    reelNumber = input.nextInt();

                    if (reelNumber == realNumber) {
                        System.out.println("Congratulations! You won the game");
                        shallBegin = false;
                        start = false;
                    } else if (reelNumber < realNumber) {
                        System.out.println("Try a larger number");
                    } else if (reelNumber > realNumber) {
                        System.out.println("Try a smaller number");
                    }

                    if (timesTried >= 5) {
                        System.out.println("Oops! Game Over");
                        shallBegin = false;
                        start = false;
                    }
                }
            } else {
                System.out.println("Should we begin the game: ");
                System.out.println("1.Yes \n2.No");
                bool = input.nextInt();
            }
        }
    }
}
