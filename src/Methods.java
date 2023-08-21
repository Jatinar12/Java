public class Methods {

    static int logic(int x, int y) {
        int z;
        if(x>y) {
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }

    int multiply(int s, int g) {
        int t;
        t = s*g;
        return t;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);

        Methods obj = new Methods();

        int a1 = 2;
        int b1 = 1;
        int c1 = logic(a1,b1);

        int a2 = 5;
        int b2 = 4;
        int c2 = obj.multiply(a2,b2);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
    }
}