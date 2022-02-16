import java.util.Scanner;

class Player {
    
    String name;
    int number = 0;

    public Player(String name) {
        this.name = name;
    }

    public void guess() {
        number = (int) (Math.random() * 100 + 1);
    }
}