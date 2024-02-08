package Arrays;

import java.util.Scanner;

public class FindLargeElement {

    public static int sortArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element is: "+ max);
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
        if (size > 3) {
            sortArray(arr);
        } else {
            System.out.println("Too small array");
        }
        scan.close();
    }

}
