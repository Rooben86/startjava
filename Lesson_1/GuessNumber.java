import java.util.Random;

public class GuessNumber {
    
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100) + 1;
        System.out.println(randomNumber);
        int guess = 50;
        while(guess != randomNumber) {
            if(guess > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                guess--;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                guess++;
            } 
        } 
        System.out.println("Поздравляю, число угадано! Это " + randomNumber);
     }
}