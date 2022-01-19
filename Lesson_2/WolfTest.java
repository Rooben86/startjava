public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf("male", "Snoopy", 60, 3, "grey"); 
        
        System.out.println("This wolf is " + wolfOne.sex);
        System.out.println("Its name is " + wolfOne.name);
        System.out.println("Its weight is " + wolfOne.weight + " kilograms");
        System.out.println("It's " + wolfOne.age + " years old");
        System.out.println("Its color is " + wolfOne.color);

        System.out.println(wolfOne.walk());
        wolfOne.sit();
        System.out.println(wolfOne.run());
        wolfOne.howl();
        wolfOne.hunt();
    }
}