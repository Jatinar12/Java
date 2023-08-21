public class MethodOverloading {
    static void change(int a) {
         a= 95;
    }

    static void change2(int [] arr) {
        arr[0] = 10;
    }

    static void foo() {
        System.out.println("Good morning mam");
    }
    static void foo(int a) {
        System.out.println("Good morning" + a + "bro");
    }

    static int sum(int ...arr) {
        int result = 0;

        for(int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println("The sum of two numbers is: " + sum(3,4));
    }
}
