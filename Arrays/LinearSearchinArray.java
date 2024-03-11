package Arrays;

import java.util.Scanner;

public class LinearSearchinArray {

    public static int LineSearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the search element: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.print("The Search element is " + arr[i] + "its at index no " + i);
            }
            return element;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index no " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        System.out.print("Array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("| " + arr[j] + " |");
        }
        LineSearch(arr);
        s.close();
    }

}
