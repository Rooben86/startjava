public class GuessNumber {
    
    public static void main(String[] args) {
        int randomNumber = 0 +(int) (Math.random()*(100 + 1));
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