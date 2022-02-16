import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void startGame() {
        
        int randomNumber = new Random().nextInt(100) + 1;
        int guessP1 = 0;
        int guessP2 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Введите имя первого игрока:");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Первого игрока зовут: "+ p1.name);
    
        System.out.println("Введите имя второго игрока:");
        Player p2 = new Player(scanner.nextLine());
        System.out.println("Второго игрока зовут: "+ p2.name);

        while(true) {
            System.out.println("Число, которое нужно угадать - " + randomNumber);

            p1.guess();
            p2.guess();

            guessP1 = p1.number;
            System.out.println(p1.name + " думает, что это - " + guessP1);

            guessP2 = p2.number;
            System.out.println(p2.name + " думает, что это - " + guessP2);

            if (guessP1 == randomNumber) {
                p1isRight = true;
            }

            if (guessP2 == randomNumber) {
                p2isRight = true;
            }

            if(p1isRight || p2isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println(p1.name + " угадал? " + p1isRight );
                System.out.println(p2.name + " угадал? " + p2isRight );
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("еще одна попытка");
            }
        }
    }
}