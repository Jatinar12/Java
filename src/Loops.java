import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int n =5;
//        for(int i=10; i>=1; i--) {
//            System.out.printf("%d X %d = %d\n", n,i,n*i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to get factorial");
        int a = sc.nextInt();

        int fact=1;

        for(int i=1; i<=a; i++) {
            fact = fact*i;
        }
        System.out.println("The factorial of number is:" + fact);
    }
}
