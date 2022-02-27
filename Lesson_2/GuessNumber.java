import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    
    Player p1;
    Player p2;
    int playerGuess = -1;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100) + 1;
        System.out.println("Компьютер загадал число " + "(" + randomNumber + ")");
        
        while(true) {
            System.out.println(p1.getName() + ", твоя очередь угадывать число!");
            p1.setGuess(scanner.nextInt());
            playerGuess = p1.getGuess();
            if(playerGuess > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                } else if (playerGuess < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Поздравляю, " + p1.getName() + " угадал число! Это " + playerGuess);
                    break;
                }
            System.out.println(p2.getName() + ", твоя очередь угадывать число!");
            p2.setGuess(scanner.nextInt());
            playerGuess = p2.getGuess();
            if(playerGuess > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                } else if (playerGuess < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Поздравляю, " + p2.getName() + " угадал число! Это " + playerGuess);
                    break;
                }
        }
    }
}