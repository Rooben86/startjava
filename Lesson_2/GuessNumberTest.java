import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String prompt;

        System.out.println("Введите имя первого игрока:");
        guessNumber.p1 = new Player(scanner.nextLine());
        System.out.println("Имя первого игрока: " + guessNumber.p1.getName());

        System.out.println("Введите имя второго игрока:");
        guessNumber.p2 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: " + guessNumber.p2.getName());

        do {
            guessNumber.play();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            prompt = scanner.next();
            while(!prompt.equalsIgnoreCase("yes")) {
                if (prompt.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Хотите продолжить игру? [yes/no]:");
                    prompt = scanner.next();
                }
            }
        } while(prompt.equalsIgnoreCase("yes"));
    }
}