import java.util.Scanner;

public class Array_positive_numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Нужно ввести 10 целых числе, в конце выведу только положиткльные !");
        for (int i = 0; i < 10; i++) {
            System.out.print(" Введите " + (i + 1) + "-е число: ");
            array[i] = scanner.nextInt();
        }

        System.out.println(" Выводим только положительные числа из массива: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] >= 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
