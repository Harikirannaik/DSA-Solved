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
        System.out.print("Enter the Search Element: ");
        int search = s.nextInt();
        boolean found=false;
            for (int i = 0; i < n; i += 1) {
                for (int j = i + 1; j < n; j += 1) {
                    for (int k = j + 1; k < n; k += 1) {
                        if (search == (arr[i] + arr[j] + arr[k])) {
                            System.out.print(search + "=>" + i + "," + j + "," + k);
                            System.out.println();
                            found=true;
                        }
                    }
                }
            }

            if(!found)
                System.out.println("not found");
        s.close();

    }
}
