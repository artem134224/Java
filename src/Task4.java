//4. Проверка возраста
//Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            checkAge(age);
            System.out.println("Возраст корректен: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Ошибка: Неверный возраст. Возраст должен быть от 0 до 150.");
        }
    }
}
