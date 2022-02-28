public class Main {

    public static int paragontiko(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * paragontiko(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(paragontiko(5));
    }
}
