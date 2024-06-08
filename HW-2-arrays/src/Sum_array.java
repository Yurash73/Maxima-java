import java.util.Random;

public class Sum_array {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        Random random = new Random();

        System.out.println("Заполняем массив случайными числами: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = random.nextInt(100) + 1;
            System.out.println(myArray[i] + " ");
        }

        int sumOfElements = sumArray(myArray);
        System.out.println("Сумма элементов массива равна: " + sumOfElements);

    }

    static int sumArray(int[] arrayForSum) {
        int sumElementsArray = 0;

        for (int i = 0; i < arrayForSum.length; i++) {
            sumElementsArray += arrayForSum[i];
        }

        return sumElementsArray;
    }
}
