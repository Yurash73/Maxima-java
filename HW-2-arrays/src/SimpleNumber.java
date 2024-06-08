import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int checkForSimple;

        System.out.print("Введите число для проверки: ");
        checkForSimple = scanner.nextInt();

        if (isSimple(checkForSimple)) {
            System.out.println(" Чсило " + checkForSimple + " простое.");
        } else {
            System.out.println(" Чсило " + checkForSimple + " составное.");
        }


    }

    static boolean isSimple(int numberForCheck) {
        boolean simpleNumber = true;
        for (int i = 2; i < numberForCheck / 2; i++) {
            if ((numberForCheck % i) == 0) {
                simpleNumber = false;
                break;
            }
        }
        return simpleNumber;
    }
}
