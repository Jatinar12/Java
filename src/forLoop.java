import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print odd numbers");
        int n = sc.nextInt();

        for(int i=0; i<=n;  ) {
            System.out.println(2*i+1);
            i++;
        }
    }
}
