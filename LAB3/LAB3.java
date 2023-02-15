<<<<<<< HEAD
import java.util.Scanner;
import java.util.Arrays;

public class LAB3 {
    public static void main(String[] args) {
        // Collect input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        // Display menu of items
        System.out.println("1. Mean Value");
        System.out.println("2. Median Value");
        System.out.println("3. Mode Value");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Compute statistics based on menu choice
        if (choice == 1) {
            double mean = computeMean(array);
            System.out.println("Mean value: " + mean);
        } else if (choice == 2) {
            double median = computeMedian(array);
            System.out.println("Median value: " + median);
        } else if (choice == 3) {
            int mode = computeMode(array);
            System.out.println("Mode value: " + mode);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // Mean value function
    public static double computeMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = (double)sum / array.length;
        return mean;
    }

    // Median value function
    public static double computeMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (double)(array[n/2 - 1] + array[n/2]) / 2.0;
        } else {
            return (double)array[n/2];
        }
    }

    // Mode value function
    public static int computeMode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = array[i];
                maxCount = count;
            }
        }
        return mode;
    }
}
=======
import java.util.Scanner;
import java.util.Arrays;

public class LAB3 {
    public static void main(String[] args) {
        // Collect input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        // Display menu of items
        System.out.println("1. Mean Value");
        System.out.println("2. Median Value");
        System.out.println("3. Mode Value");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Compute statistics based on menu choice
        if (choice == 1) {
            double mean = computeMean(array);
            System.out.println("Mean value: " + mean);
        } else if (choice == 2) {
            double median = computeMedian(array);
            System.out.println("Median value: " + median);
        } else if (choice == 3) {
            int mode = computeMode(array);
            System.out.println("Mode value: " + mode);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // Mean value function
    public static double computeMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = (double)sum / array.length;
        return mean;
    }

    // Median value function
    public static double computeMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (double)(array[n/2 - 1] + array[n/2]) / 2.0;
        } else {
            return (double)array[n/2];
        }
    }

    // Mode value function
    public static int computeMode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = array[i];
                maxCount = count;
            }
        }
        return mode;
    }
}
>>>>>>> c6f42ce4bbb8730cd76fcb51198420e246465125
