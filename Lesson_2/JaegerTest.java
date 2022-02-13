public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(260f);
        jaeger1.setStrength(8);

        jaeger2.setModelName("Striker Eureka");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(230f);
        jaeger2.setStrength(10);

        System.out.println("Model names: " + jaeger1.getModelName() + ", " + jaeger2.getModelName());
        System.out.println("Origins: " + jaeger1.getOrigin() + ", " + jaeger2.getOrigin());
        System.out.println("Heights: " + jaeger1.getHeight() + ", " + jaeger2.getHeight());
        System.out.println("Strengths: "+ jaeger1.getStrength() + ", " + jaeger2.getStrength());

        jaeger1.fight();
        jaeger1.makePowerMove();
        jaeger1.useWeapon();

        jaeger2.fight();
        System.out.println(jaeger2.makePowerMove());
        jaeger2.useWeapon();
    }
}