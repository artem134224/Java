//6. Факториал
//Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число для вычисления факториала: ");
            int number = scanner.nextInt();

            long result = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long calculateFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Ошибка: Факториал не существует для отрицательных чисел.");
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
