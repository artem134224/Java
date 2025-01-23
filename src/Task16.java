//16. Конкатенация строк
//Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
public class Task16 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;  // Пример второй строки, которая равна null

        try {
            String result = concatenateStrings(str1, str2);
            System.out.println("Результат конкатенации: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String concatenateStrings(String str1, String str2) throws NullPointerException {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Ошибка: Одна из строк равна null.");
        }
        return str1 + str2;
    }
}
