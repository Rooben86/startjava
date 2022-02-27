public class Player {
    
    private String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGuess() {
        return guess;
    }
}