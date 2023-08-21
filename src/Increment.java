import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = 7;
        int x = ++y * 8;        //Fi// rst incremented then y value is used
        System.out.println("The value of x:" + x);


        char a = 'b';
        System.out.println(++a);
    }
}





