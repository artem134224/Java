//10. Поиск элемента в массиве
//Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 9, 4, 5};  // Пример массива
        int elementToFind = 3;  // Элемент для поиска

        try {
            int index = findElement(array, elementToFind);
            System.out.println("Элемент найден на индексе: " + index);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findElement(int[] array, int element) throws ElementNotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;  // Возвращаем индекс найденного элемента
            }
        }
        throw new ElementNotFoundException("Ошибка: Элемент " + element + " не найден в массиве.");
    }
}

// Кастомное исключение для случая, когда элемент не найден
class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
