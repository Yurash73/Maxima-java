import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int maxNumberInArray = -2_147_483_648;

        System.out.println("Нужно ввести 5 целых числе, в конце выведу только положиткльные !");
        for (int i = 0; i < 5; i++) {
            System.out.print(" Введите " + (i + 1) + "-е число: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (maxNumberInArray < array[i]) {
                maxNumberInArray = array[i];
            }
        }

        System.out.println("Максимальное числов в массиве: " + maxNumberInArray);
    }
}
