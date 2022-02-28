public class Main {

    public static int fibonacci(int num1, int num2) {
        if (num2 == 144) {
            return 0;
        } else {
            int num3 = num1 + num2;
            System.out.println(num3);
            int num4 = fibonacci(num2, num3);    
            return num4;
        }
    }

    public static void main(String[] args) {
        System.out.println(1);
        fibonacci(0, 1);
    }

}
