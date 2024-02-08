package Arrays;

import java.util.Scanner;

public class LinearSearchinArray {

    public static void linearSearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you are searching for: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Your number is " + element + " its at index " + i);
            }
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();

        linearSearch(arr);
        s.close();
    }
   

}
