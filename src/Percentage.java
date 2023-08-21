import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Maths: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of History");
        int b = sc.nextInt();
        System.out.println("Enter the marks of science");
        int c = sc.nextInt();
        System.out.println("Enter the marks of Hindi");
        int d = sc.nextInt();
        System.out.println("Enter the marks of Social science");
        int e = sc.nextInt();

        float sum = (a+b+c+d+e)/5;
        System.out.println("Percentage of student:"+ sum+"%");


    }
}
