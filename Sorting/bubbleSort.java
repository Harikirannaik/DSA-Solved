package Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at " + i + "th index: ");
            arr[i] = s.nextInt();
        }
        int temp =0;
        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(i+"th element is: " + arr[i]);
        }


        s.close();
    }
}
