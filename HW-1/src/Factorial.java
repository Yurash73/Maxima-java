import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Число должно быть больше 0 ");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Факториал " + number + " равен : " + factorial);
    }
}
