//14. Парольная проверка
//Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.
public class Task14 {
    public static void main(String[] args) {
        String password = "12345";  // Пример пароля для проверки

        try {
            checkPasswordStrength(password);
            System.out.println("Пароль соответствует требованиям.");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkPasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Ошибка: Пароль слишком слабый. Он должен содержать хотя бы 8 символов.");
        }
    }
}

// Кастомное исключение для слабого пароля
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}
