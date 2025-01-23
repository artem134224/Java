//8. Калькулятор возведения в степень
//Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число (основание): ");
            double base = scanner.nextDouble();

            System.out.print("Введите степень: ");
            int exponent = scanner.nextInt();

            double result = power(base, exponent);
            System.out.println("Результат: " + base + " в степени " + exponent + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double power(double base, int exponent) throws IllegalArgumentException {
        if (exponent < 0) {
            throw new IllegalArgumentException("Ошибка: Степень не может быть отрицательной.");
        }
        return Math.pow(base, exponent);
    }
}
