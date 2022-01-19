public class Wolf {
    
    String sex;
    String name;
    int weight;
    int age;
    String color;

    public Wolf(String sex, String name, int weight, int age, String color) {
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    
    String walk() {
        return "walking";
    }

    void sit() {
        System.out.println("sitting");
    }

    String run() {
        return "running";
    }

    boolean howl() {
        System.out.println("howling");
        return true;
    }

    void hunt() {
        System.out.println("hunting");
    }
}