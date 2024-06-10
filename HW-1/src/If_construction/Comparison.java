package If_construction;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;


        System.out.println(" Сравнение  двух чисел.");
        System.out.println("Введите первое число: ");
        first_number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        second_number = scanner.nextInt();

        if (first_number > second_number ) {
            System.out.println( "Первое число больше второго");
        } else if (second_number > first_number) {
            System.out.println("Второе число больше первого ");
        }
        else {
            System.out.println(" Числа равны.");
        }


    }
}
