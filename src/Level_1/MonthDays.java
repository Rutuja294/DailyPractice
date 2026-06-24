package Level_1;

public class MonthDays {

    public static String getDays(int month) {

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31 Days";

            case 4:
            case 6:
            case 9:
            case 11:
                return "30 Days";

            case 2:
                return "28 Days";

            default:
                return "Invalid Month";
        }
    }

    public static void main(String[] args) {

        System.out.println(getDays(2));
        System.out.println(getDays(4));
        System.out.println(getDays(12));

    }
}