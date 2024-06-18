import java.util.Random;

public class MinMaxInArray {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int[] finalArray = new int[2];

        Random random = new Random();

        System.out.println("Заполняем массив случайными числами: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = random.nextInt(300) + 1;
            System.out.println(myArray[i] + " ");
        }

        finalArray = minMax(myArray);

        System.out.println("Минимальное число в массиве: " + finalArray[0]);
        System.out.println("Максимальное число в массиве: " + finalArray[1]);
    }

    static int[] minMax(int[] arrayForCheck) {
        int[] returnArray = new int[2];

        int min = arrayForCheck[0];
        int max = arrayForCheck[0];

        for (int i = 1; i < arrayForCheck.length; i++) {
            if (max < arrayForCheck[i]) {
                max = arrayForCheck[i];
            }
            if (min > arrayForCheck[i]) {
                min = arrayForCheck[i];
            }
        }

        returnArray[0] = min;
        returnArray[1] = max;

        return returnArray;
    }
}
