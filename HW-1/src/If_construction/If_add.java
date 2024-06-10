package If_construction;

import java.util.Scanner;

public class If_add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;

        System.out.println(" Сложение двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextInt();
        if (first_number < 0 || second_number < 0) {
            System.out.println("Я не хочу работать с отрицательными числами");
            return;
        } else {
            int result = first_number + second_number;
            System.out.println("Сумма " + first_number + " и " + second_number +
                    " будет: " + result);
        }

    }
}
