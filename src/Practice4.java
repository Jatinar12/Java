import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
//        int a = 11;
//        if (a == 11) {
//            System.out.println("Yes, I am 11");
//        }
//        else {
//            System.out.println("Yes, I am not 11");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks: ");
        int a = sc.nextInt();

        System.out.println("Enter Maths Marks: ");
        int b = sc.nextInt();

        System.out.println("Enter Science Marks: ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        System.out.println("Your overall percentage is:" + avg);

        if(avg>40 && a>33 && b>33  && c>33) {
            System.out.println("Congrats");
        }
        else {
            System.out.println("Try again next time");
        }

    }
}
