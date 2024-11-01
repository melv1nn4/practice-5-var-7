import java.util.Scanner;

public class calculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // введите значение a и b
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        // введите значение x
        double x = 6;

        double result;

        if (x >= -1 && x < 6) {
            result = Math.sin(x); // 1
        } else if (x == 6) {
            result = 3 * x * x + b * x - 3; // 2
        } else if (x > 6 && b * x + a > 0) {
            result = Math.log(b * x + a); // 3
        } else {
            System.out.println("ошибка , не допустимое значение для вычисления.");
            result = Double.NaN;
        }

        System.out.println("Значение f(" + x + "): " + result);
        scanner.close();
    }
}