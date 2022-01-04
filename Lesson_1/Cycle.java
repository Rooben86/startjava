public class Cycle {
    public static void main(String[] args) {

        for(int i = 1; i < 21; i++) {
            System.out.println(i);
        }

        int i = 6;
        while(i > -7) {
            System.out.println(i);
            i = i - 2;
        } 

        int result = 0;
        int j = 10;
        do {
            if(j % 2 != 0) {
                result = result + j;
            } 
            j++;
        } while (j <= 20);

        System.out.println("The sum of odd numbers between 10 and 20 makes " + result);
    }
}