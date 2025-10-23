import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Date and Time of Birth ===");

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int day = 0;


        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;


            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;


            case 2:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour (24-hour format)", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);


        System.out.printf("\nYou were born on %02d/%02d/%d at %02d:%02d\n",
                month, day, year, hour, minute);
    }
}

