//7. Проверка массива на нули
//Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};  // Пример массива

        try {
            checkForZeros(array);
            System.out.println("Массив не содержит нулей.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForZeros(int[] array) throws IllegalArgumentException {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Ошибка: Массив содержит ноль.");
            }
        }
    }
}
