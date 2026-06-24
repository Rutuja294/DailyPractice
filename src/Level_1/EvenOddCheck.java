package Level_1;

public class EvenOddCheck {

    public static String check(int a, int b) {

        if(a % 2 == 0 && b % 2 == 0) {
            return "Both are Even";
        }
        else if(a % 2 != 0 && b % 2 != 0) {
            return "Both are Odd";
        }
        else {
            return "One is Even and One is Odd";
        }
    }

    public static void main(String[] args) {

        System.out.println(check(4, 6));
        System.out.println(check(3, 7));
        System.out.println(check(5, 8));

    }
}