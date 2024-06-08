import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int userInputNumber = 0;

        Scanner scanner = new Scanner(System.in);

        boolean ugadal = false;
        System.out.println("Угадайте число от 1 до 100.");
        while (!ugadal)  {
            System.out.print("Введите число: ");
            userInputNumber = scanner.nextInt();

            if (userInputNumber > randomNumber) {
                System.out.println(" Ваше число больше, чем я загадал.");
                ugadal = false;
            }
            else if (userInputNumber < randomNumber) {
                System.out.println(" Ваше число меньше, чем я загадал.");
                ugadal = false;
            }
            else {
                System.out.println(" МАЛАДЕЦ!!!  Угадал. ");
                System.out.println("Я загада число - " + randomNumber);
                ugadal = true;
            }

        }
    }
}
