import java.util.Random;
import java.util.Scanner;

public class Week3_RandomDemo {
    public static void main(String[] args) {
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10) + 1;
        var inputReader = new Scanner(System.in);
        System.out.print("pick a random number from 1 to 10:");
        var usersNumber = inputReader.nextInt();
        while (usersNumber != randomNumber) {
            if (randomNumber > usersNumber) {
                System.out.println("Unfortunately, " + usersNumber + " was too low. Guess again!");
                usersNumber = inputReader.nextInt();
            }
            else {
                System.out.println("Unfortunately, " + usersNumber + " was too high. Guess again!");
                usersNumber = inputReader.nextInt();
            }
        }
        System.out.println("You were right! The number was " + randomNumber);
    }
}