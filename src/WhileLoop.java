import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i = 100;
//        while(i<=200) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Code's runs successfully");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        while(a<=100) {
            System.out.println(a);
            a++;
        }
    }
}
