package Arrays;

import java.util.Scanner;

public class pairArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value at " + i + "th index: ");
            arr[i] = s.nextInt();
        }
            // 1st number
           for(int i=0;i<n;i+=1){
            for(int j=i+1;j<n;j+=1)
                System.out.println(arr[i]+","+arr[j]);
           }
            s.close();
                
            }
        }
