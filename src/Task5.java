//5. Нахождение корня
//Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число для нахождения квадратного корня: ");
            double number = scanner.nextDouble();

            double result = findSquareRoot(number);
            System.out.println("Квадратный корень из " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double findSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Ошибка: Невозможно вычислить квадратный корень из отрицательного числа.");
        }
        return Math.sqrt(number);
    }
}
