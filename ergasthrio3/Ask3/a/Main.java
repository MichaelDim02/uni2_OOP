public class Main {

    public static int protos(int n, int n2) {
 
        if (n2 == 1)
            return 1;
        if (n % n2 == 0)
            return 0;
        else
            return protos(n, n2-1);
    }

    public static void main(String[] args) {

	// ο αριθμός
        int num = 7;

        System.out.println(protos(num, num-1));
    }

}
