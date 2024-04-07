package Sorting;

import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at " + i + "th index: ");
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < n; i += 1) {
            // insert ith element in sorted portion
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            // Position will be j+1
            arr[j+1]=temp;
        }
        for(int i=0; i<n; i++){
            System.out.println(i+"th element is: " + arr[i]);
        }
    
        s.close();
    }
    
}
