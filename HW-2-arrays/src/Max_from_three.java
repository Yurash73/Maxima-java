import java.util.Scanner;

public class Max_from_three {
    public static void main(String[] args) {

        int firstNumber, secondNumber, thirdNUmber;
        int maxOfThreeNumber;

        firstNumber = 25;
        secondNumber = 99;
        thirdNUmber = 18;

        maxOfThreeNumber = maxOfThree(firstNumber, secondNumber, thirdNUmber);

        System.out.println(" Максимальное из трёх чисел: " + maxOfThreeNumber);
    }

    static int maxOfThree(int... numbers) {
        int max = -2_147_483_648;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


}
