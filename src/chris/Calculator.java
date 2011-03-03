package chris;

public class Calculator {

    public static int add(int... a) {
        int r = 0;
        for (int i : a) {
            r += i;
        }
        return r;
    }

    public static void main(String args[]) {
        System.out.println(Calculator.add(10, 20, 30, 40, 50, 40, 50));
        System.out.println(Calculator.add(10, 20, 30, 40));
    }


}
