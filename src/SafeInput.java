import java.util.Scanner;
import java.util.regex.Pattern;


public class SafeInput {

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid integer
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
            pipe.nextLine(); // clear the newline
        } while (!valid);

        return retValue;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid double
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
            pipe.nextLine(); // clear the newline
        } while (!valid);

        return retValue;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    low end of the range
     * @param high   high end of the range
     * @return a valid integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("Input is out of range. Please enter between " + low + " and " + high + ".");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
            pipe.nextLine(); // clear newline
        } while (!valid);

        return retValue;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    low end of the range
     * @param high   high end of the range
     * @return a valid double within the range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("Input is out of range. Please enter between " + low + " and " + high + ".");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
            pipe.nextLine(); // clear newline
        } while (!valid);

        return retValue;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return true for Yes, false for No
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean valid = false;
        boolean retVal = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();

            if (response.equals("Y")) {
                retVal = true;
                valid = true;
            } else if (response.equals("N")) {
                retVal = false;
                valid = true;
            } else {
                System.out.println("You must enter Y or N.");
            }
        } while (!valid);

        return retVal;
    }

    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  the RegEx pattern in Java String format
     * @return a String that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if (Pattern.matches(regEx, response)) {
                valid = true;
            } else {
                System.out.println("Input does not match the required pattern. Try again.");
            }
        } while (!valid);

        return response;
    }

    /**
     *
     * @param msg the message to display in the header
     */
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int msgLen = msg.length();
        int totalSpaces = WIDTH - msgLen - 6; // account for *** and ***
        int sideSpaces = totalSpaces / 2;

        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("***");
        for (int i = 0; i < sideSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < (WIDTH - msgLen - sideSpaces - 6); i++) {
            System.out.print(" ");
        }
        System.out.println("***");


        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
