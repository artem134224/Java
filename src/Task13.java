//13. Чтение элемента списка
//Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        try {
            String element = getElementAtIndex(list, 2);  // Индекс для чтения
            System.out.println("Элемент на индексе 2: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getElementAtIndex(List<String> list, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Ошибка: Индекс " + index + " выходит за пределы списка.");
        }
        return list.get(index);
    }
}
