package If_construction;

import java.util.Scanner;

public class If_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first_number = 0.0;
        double second_number = 0.0;
        double result = 0.0;

        System.out.println(" Вычитание  двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextDouble();

        if (first_number == 0.0 || second_number == 0.0) {
            System.out.println("Не вводите нуль");
            return;
        }

        if (first_number > second_number) {
            result = first_number / second_number;
            System.out.println("Частное от деления " + first_number + " на " + second_number +
                    " будет :" + result);
        } else if (second_number > first_number) {
            result = second_number / first_number;
            System.out.println("Частное от деления " + second_number + " на " + first_number +
                    " будет :" + result);
        } else {
            System.out.println("Частное от деления " + second_number + " на " + first_number +
                    " будет : " + 1);
        }
    }
}
