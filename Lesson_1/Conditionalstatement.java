public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 19;
        if (age > 20) {
            System.out.println("older than 20");
        } else {
            System.out.println("younger than 20");
        }

        boolean maleSex = true;
        if (maleSex) {
            System.out.println("MALE");
        }
        if (!maleSex) {
            System.out.println("FEMALE");
        }

        double height = 1.85;
        if (height < 1.80) {
            System.out.println("shorter 1.8m");
        } else {
            System.out.println("taller than 1.8m");
        }

        char namesFirstCase = 'I';
        if (namesFirstCase == 'M') {
            System.out.println("The name starts with M");
        } else if (namesFirstCase == 'I') {
            System.out.println("The name starts with I");
        } else {
            System.out.println("The name starts with neither M nor I");
        }
    }
}