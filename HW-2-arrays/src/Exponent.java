import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        int result;

        System.out.println("Введите число, которое возведем в степень: ");
        base = scanner.nextInt();

        System.out.println("Введите степень, в которую возведем число: ");
        exponent = scanner.nextInt();

        result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        System.out.println(" Результат возведения " + base + " в степень " +
                exponent + " равен: " + result);
    }
}
