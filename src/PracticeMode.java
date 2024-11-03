import java.util.Random;
import java.util.Scanner;

public class PracticeMode {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public void showPracticeMenu() {
        while (true) {
            System.out.println("Тренировка:");
            System.out.println("Выберите число для тренировки умножения (от 2 до 9) или 1 для возврата в главное меню:");
            int number = scanner.nextInt();

            if (number == 1) {
                return;
            } else if (number < 2 || number > 9) {
                System.out.println("Данное число не корректно, введите целое число от 2 до 9.");
                continue;
            }
            
            startPracticeSession(number);
        }
    }

    private void startPracticeSession(int number) {
        while (true) {
            int multiplier = random.nextInt(8) + 2;
            int correctAnswer = number * multiplier;
            
            System.out.println("Сколько будет " + number + " * " + multiplier + "?");

            int[] options = generateOptions(correctAnswer);
            System.out.println("1: " + options[0]);
            System.out.println("2: " + options[1]);
            System.out.println("3: " + options[2]);
            
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Нет такого варианта ответа!");
            } else if (options[choice - 1] == correctAnswer) {
                System.out.println("Верно!");
            } else {
                System.out.println("Не верно!");
            }

            System.out.println("1 - Главное меню, 2 - Продолжить");
            int nextChoice = scanner.nextInt();

            if (nextChoice == 1) {
                return;
            }
        }
    }

    private int[] generateOptions(int correctAnswer) {
        int[] options = new int[3];
        int correctPosition = random.nextInt(3);
        options[correctPosition] = correctAnswer;

        for (int i = 0; i < 3; i++) {
            if (i == correctPosition) continue;
            int incorrectAnswer;
            do {
                incorrectAnswer = correctAnswer + random.nextInt(10) - 5;
            } while (incorrectAnswer == correctAnswer);
            options[i] = incorrectAnswer;
        }

        return options;
    }
}
