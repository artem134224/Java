//18. Квадратный корень
//Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.

public class Task18 {
    public static void main(String[] args) {
        double number = -9;  // Пример числа для вычисления квадратного корня

        try {
            double result = sqrt(number);
            System.out.println("Квадратный корень числа " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sqrt(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Ошибка: Невозможно вычислить квадратный корень для отрицательного числа.");
        }
        return Math.sqrt(number);
    }
}
