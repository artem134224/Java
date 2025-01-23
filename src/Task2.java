//2. Калькулятор деления
//Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число (делимое): ");
            double numerator = scanner.nextDouble();

            System.out.print("Введите второе число (делитель): ");
            double denominator = scanner.nextDouble();

            double result = divide(numerator, denominator);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static double divide(double numerator, double denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно.");
        }
        return numerator / denominator;
    }
}
