package Level_1;

public class Greeting {

    public static String greet(int hour) {

        if(hour >= 5 && hour <= 11) {
            return "Good Morning";
        }
        else if(hour >= 12 && hour <= 16) {
            return "Good Afternoon";
        }
        else if(hour >= 17 && hour <= 20) {
            return "Good Evening";
        }
        else if(hour >= 0 && hour <= 23) {
            return "Good Night";
        }
        else {
            return "Invalid Hour";
        }
    }

    public static void main(String[] args) {

        System.out.println(greet(8));
        System.out.println(greet(14));
        System.out.println(greet(18));
        System.out.println(greet(22));

    }
}