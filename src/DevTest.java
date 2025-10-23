import java.util.Scanner;


public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== SafeInput Library Testing ===");

        // getNonZeroLenString
        System.out.println("\nTesting getNonZeroLenString:");
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        //  Test getInt
        System.out.println("\nTesting getInt:");
        int intVal = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered integer: " + intVal);

        //  getDouble
        System.out.println("\nTesting getDouble:");
        double dblVal = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered double: " + dblVal);

        //  getRangedInt
        System.out.println("\nTesting getRangedInt:");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer between 1 and 10", 1, 10);
        System.out.println("You entered ranged integer: " + rangedInt);

        // getRangedDouble
        System.out.println("\nTesting getRangedDouble:");
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 10.0", 0.5, 10.0);
        System.out.println("You entered ranged double: " + rangedDouble);

        // getYNConfirm
        System.out.println("\nTesting getYNConfirm:");
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You answered: " + (confirm ? "Yes" : "No"));

        // getRegExString (MNumber pattern)
        System.out.println("\nTesting getRegExString (M########):");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC MNumber (M followed by 8 digits)", "^(M|m)\\d{8}$");
        System.out.println("You entered MNumber: " + mNumber);

        // getRegExString
        System.out.println("\nTesting getRegExString (Menu pattern):");
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O/S/V/Q]", "^[OoSsVvQq]$");
        System.out.println("You entered menu choice: " + menuChoice);

        // H: Test prettyHeader
        System.out.println("\nTesting prettyHeader:");
        SafeInput.prettyHeader("Lab 08 Get Methodical Complete");

        System.out.println("\nAll SafeInput method tests complete!");
    }
}