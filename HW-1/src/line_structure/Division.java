package line_structure;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first_number = 0;
        double second_number = 0;

        System.out.println(" Вычитание  двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextDouble();

        double result = first_number / second_number;

        System.out.println("Частное от деления " + first_number + " на " + second_number +
                " будет :" + result);
    }
}
