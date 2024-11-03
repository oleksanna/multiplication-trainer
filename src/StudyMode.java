import java.util.Scanner;

public class StudyMode {
    private final Scanner scanner = new Scanner(System.in);

    public void showStudyMenu() {
        while (true) {
            System.out.println("Изучение:");
            System.out.println("Выберите число для изучения умножения (от 2 до 9) или 1 для возврата в главное меню:");
            int number = scanner.nextInt();

            if (number == 1) {
                return;
            } else if (number < 2 || number > 9) {
                System.out.println("Данное число не корректно, введите целое число от 2 до 9.");
                continue;
            }
            
            startStudySession(number);
        }
    }

    private void startStudySession(int number) {
        while (true) {
            System.out.print("Введите число от 2 до 9 для умножения на " + number + ": ");
            int input = scanner.nextInt();

            if (input < 2 || input > 9) {
                System.out.println("Данное число не корректно, введите целое число от 2 до 9.");
                continue;
            }
            
            System.out.println(number + " * " + input + " = " + (number * input));

            System.out.println("1 - Главное меню, 2 - Продолжить");
            int choice = scanner.nextInt();

            if (choice == 1) {
                return;
            }
        }
    }
}