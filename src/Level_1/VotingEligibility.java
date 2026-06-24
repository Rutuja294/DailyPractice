package Level_1;

public class VotingEligibility {

    public static String check(int age) {
        if(age >= 18) {
            return "Eligible for Voting";
        }
        else {
            return "Not Eligible for Voting";
        }
    }

    public static void main(String[] args) {
        System.out.println(check(20));
        System.out.println(check(16));
    }
}
