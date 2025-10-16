import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //test for getNonZeroLenString
    String name = getNonZeroLenString(in, "Enter your name: ");
    System.out.println("Hello " + name);

    // test for getInt
        int age = getInt(in, "Enter your age");
        System.out.println("You are " + age);
        //code for the library methods goes here to be tested
        //then is copied or moves to SafeInput
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     * @return
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt the prompt to display to the user to indicate what to input
     * @return any integer value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" +prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();

            }
        }
    }
}