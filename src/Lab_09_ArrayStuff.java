import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        System.out.println("Array created with length: " + dataPoints.length);

        //task 2
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("First 10 random values:");
        for (int i = 0; i < 10; i++) {
            System.out.print(dataPoints[i] + " ");
        }
        System.out.println();


        //task 3
        System.out.println("Randomly generated values:");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) {
                System.out.print(dataPoints[i] + " ");
                System.out.println();
            }
            //task 4
            int sum = 0;
            for (int value : dataPoints) {
                sum += value;
            }
            double average = (double) sum / dataPoints.length;

            System.out.println("The sum of all 100 values is: " + sum);
            System.out.printf("The average (mean) value is: %.2f%n", average);
        }

        //task 5
        Scanner in = new Scanner(System.in);
        int userValToCount = SafeInput.getRangedInt(in, "Enter a value to COUNT in the array", 1, 100);
        System.out.println("You entered: " + userValToCount);

        //task 6
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValToCount) {
                count++;
            }
        }
        System.out.printf("The value %d appears %d time(s) in the array.%n", userValToCount, count);


        //task 7

        int userValToFind = SafeInput.getRangedInt(in, "Enter a value to FIND (first index) in the array", 1, 100);
        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValToFind) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex >= 0) {
            System.out.printf("The value %d was found at array index %d.%n", userValToFind, foundIndex);
        } else {
            System.out.printf("The value %d was NOT found in the array.%n", userValToFind);

            //task 8

            int min = dataPoints[0];
            int max = dataPoints[0];
            for (int i = 1; i < dataPoints.length; i++) {
                if (dataPoints[i] < min) min = dataPoints[i];
                if (dataPoints[i] > max) max = dataPoints[i];
            }
            System.out.printf("The minimum value in the array is %d.%n", min);
            System.out.printf("The maximum value in the array is %d.%n", max);
        }
        //task 9
    }
            public static double getAverage(int[] values) {
                if (values == null || values.length == 0) return 0.0;

                int sum = 0;
                for (int value : values) sum += value;

                return (double) sum / values.length;

            }
        }

