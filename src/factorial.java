public class factorial {

    static int factorial1(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        else {
            return n * factorial1(n-1);
        }
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("The value of factorial is:" + factorial1(n));
    }
}
