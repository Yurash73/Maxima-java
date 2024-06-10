package line_structure;

import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;

        System.out.println(" Печать диапазона чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextInt();

        if (first_number < second_number) {
            System.out.println("Печатаем числа от " + first_number + " до " +
                    second_number);
            for (int i = first_number; i <= second_number; i++) {
                System.out.println(i);
            }
        } else if (first_number > second_number) {
            System.out.println("Печатаем числа от " + second_number + " до " +
                    first_number);
            for (int i = first_number; i >= second_number; i--) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Числа равны.");
        }
    }
}
