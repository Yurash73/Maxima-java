package If_construction;

import java.util.Scanner;

public class If_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;
        int result = 0;

        System.out.println(" Вычитание  двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextInt();

        if (first_number > second_number) {
            result = first_number - second_number ;
            System.out.println("Разность двух числе: " + result);
        } else if (second_number > first_number) {
            result = second_number - first_number;
            System.out.println("Разность двух чисел:" + result);
        }
        else System.out.println("Разность двух чисел:" + result);

    }
}
