public class Unicode {
    public static void main(String[] args) {
        char ch = '\u0033';
        do {
        System.out.println(ch);
        ch++;
       } while(ch <= '\u0126');
    }
}