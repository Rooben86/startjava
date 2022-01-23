public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setSex("female");
        wolfOne.setName("Wendy");
        wolfOne.setWeight(50);
        wolfOne.setAge(7);
        wolfOne.setColor("white");
        
        System.out.println("This wolf is " + wolfOne.getSex());
        System.out.println("Its name is " + wolfOne.getName());
        System.out.println("Its weight is " + wolfOne.getWeight() + " kilograms");
        System.out.println("It's " + wolfOne.getAge() + " years old");
        System.out.println("Its color is " + wolfOne.getColor());

        System.out.println(wolfOne.walk());
        wolfOne.sit();
        System.out.println(wolfOne.run());
        wolfOne.howl();
        wolfOne.hunt();
    }
}