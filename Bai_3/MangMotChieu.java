import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTasks {

    public static void main(String[] args) {
        int[] array = {3, 11, 7, 2, 9, 10};
        int targetSum = 20;

        System.out.println("Sap xep cac so nguyen to:");
        int[] primesSorted = SapXepNguyenTo(array);
        System.out.println(Arrays.toString(primesSorted));

        System.out.println("\nMang co tong la " + targetSum + ":");
        TimMangCoTong(array, targetSum);

        System.out.println("\nMang con co the co:");
        TimMangCon(array);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] SapXepNguyenTo(int[] array) {
        return Arrays.stream(array)
                .filter(ArrayTasks::isPrime)
                .sorted()
                .toArray();
    }

    public static void TimMangCoTong(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == targetSum) {
                    int[] subarray = Arrays.copyOfRange(array, i, j + 1);
                    System.out.println(Arrays.toString(subarray));
                }
            }
        }
    }

    public static void TimMangCon(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int[] subarray = Arrays.copyOfRange(array, i, j + 1);
                System.out.println(Arrays.toString(subarray));
            }
        }
    }
}
