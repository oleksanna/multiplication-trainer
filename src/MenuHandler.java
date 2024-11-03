import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        while (true) {
            System.out.println("Главное меню:");
            System.out.println("1 - Изучение");
            System.out.println("2 - Тренировка");
            System.out.println("3 - Проверка знаний");
            System.out.println("0 - Выход");
            System.out.print("Выберите опцию: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    new StudyMode().showStudyMenu();
                    break;
                case 2:
                    new PracticeMode().showPracticeMenu();
                    break;
                case 3:
                    new KnowledgeTestMode().showTestMenu();
                    break;
                case 0:
                    System.out.println("Завершение работы...");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}