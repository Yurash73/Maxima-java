package line_structure;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;

        System.out.println("Умножение  двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextInt();

        int result = first_number * second_number;

        System.out.println("Произведение " + first_number + " и " + second_number +
                " будет :" + result);
    }
}
