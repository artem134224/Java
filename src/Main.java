//1. Функция для нахождения максимума
//Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            System.out.println("Максимум: " + getMax(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getMax(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны! Ошибка.");
        }
        return (a > b) ? a : b;
    }
}
