public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 19;
        boolean maleSex = true;
        double height = 1.85;
        char firstCase = 'I';

        if (age > 20) {
            System.out.println("older than 20");
        } else {
            System.out.println("younger than 20");
        }
        if (maleSex) {
            System.out.println("MALE");
        }
        if (!maleSex) {
            System.out.println("FEMALE");
        }
        if (height < 1.80) {
            System.out.println("shorter 1.8m");
        } else {
            System.out.println("taller than 1.8m");
        }
        if (firstCase == 'M') {
            System.out.println("The name starts with M");
        } else if (firstCase == 'I') {
            System.out.println("The name starts with I");
        } else {
            System.out.println("The name starts with neither M nor I");
        }
    }
}