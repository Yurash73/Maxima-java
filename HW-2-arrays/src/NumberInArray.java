import com.sun.xml.internal.bind.v2.util.StackRecorder;

import java.util.Random;

public class NumberInArray {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int numberForSearch;
        Random random = new Random();
        boolean result;

        System.out.println("Заполняем массив случайными числами: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = random.nextInt(20) + 1;
            System.out.println(myArray[i] + " ");
        }

        numberForSearch = random.nextInt(20) + 1;

        result = contains(myArray, numberForSearch);
        System.out.println("Содержит ли массив число: " + numberForSearch +
                            " ответ: " + result);

    }

    static boolean contains(int[] arrayForSearch, int target) {
        boolean result = false;

       for (int i=0; i<arrayForSearch.length; i++) {
           if (target == arrayForSearch[i]) result = true;
       }

       return result;
    }
}
