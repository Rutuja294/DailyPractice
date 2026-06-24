package Level_1;

public class AlphabetRange {

    public static String check(char ch) {

        ch = Character.toLowerCase(ch);

        if(ch >= 'a' && ch <= 'm') {
            return "Between a and m";
        }
        else if(ch >= 'n' && ch <= 'z') {
            return "Between n and z";
        }
        else {
            return "Not an alphabet";
        }
    }

    public static void main(String[] args) {

        System.out.println(check('c'));
        System.out.println(check('t'));
        System.out.println(check('A'));

    }
}