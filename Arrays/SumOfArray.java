package Arrays;

import java.util.Scanner;

public class SumOfArray {
    // private static int[] arr;

    // public SumOfArray(int[] arr) {
    // SumOfArray.arr = arr;
    // }

    // public static int sum() {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }
    // return sum;
    // }
    public static void DisplayArray(int[] arr) {
        System.out.print("Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }

    }

    public static int totalsum(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        System.out.println();
        System.out.println("Sum is: " + result);
        return result;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner s = new Scanner(System.in);

        // Size of the array
        System.out.print("enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + " index: ");
            arr[i] = s.nextInt();
        }
        DisplayArray(arr);
        totalsum(arr);
        // int result = SumOfArray.sum();

        s.close();
    }

}
