
public class Main {

    public static int protos(int n, int n2) {

        if ( n2 == 1 )
            return 1;
        if ( n % n2 == 0 )
            return 0;
        else
            return protos(n, n2-1);
    }

    public static void main(String[] args) {

        for ( int i = 2; i <= 1000; i++ ) {
            if ( protos(i, i-1) == 1 ) {
                System.out.println(i);
            }
        }
    }

}
