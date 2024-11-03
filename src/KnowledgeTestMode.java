import java.util.Random;
import java.util.Scanner;

public class KnowledgeTestMode {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public void showTestMenu() {
        while (true) {
            System.out.println("Проверка знаний:");
            System.out.println("Выберите число для проверки умножения (от 2 до 9) или 10 для полной таблицы умножения. 1 для возврата в главное меню:");
            int number = scanner.nextInt();

            if (number == 1) {
                return;
            } else if (number < 2 || number > 10) {
                System.out.println("Данное число не корректно, введите целое число от 2 до 9 или 10.");
                continue;
            }
            
            startTestSession(number);
        }
    }

    private void startTestSession(int number) {
        while (true) {
            int multiplier = (number == 10) ? random.nextInt(8) + 2 : number;
            int multiplicand = random.nextInt(8) + 2;
            int correctAnswer = multiplier * multiplicand;

            System.out.print("Сколько будет " + multiplier + " * " + multiplicand + "? ");
            int answer = scanner.nextInt();

            if (answer == correctAnswer) {
                System.out.println("Верно!");
            } else {
                System.out.println("Не верно! Правильный ответ: " + correctAnswer);
            }

            System.out.println("1 - Главное меню, 2 - Продолжить");
            int choice = scanner.nextInt();

            if (choice == 1) {
                return;
            }
        }
    }
}