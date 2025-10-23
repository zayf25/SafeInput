import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN accepted: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (M########)", "^(M|m)\\d{8}$");
        System.out.println("M number accepted: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [O, S, V, Q]", "^[OoSsVvQq]$");
        System.out.println("Menu choice accepted: " + menuChoice);
    }
}
