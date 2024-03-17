import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            // Space
            for(int j=0; j<n-i-1;j++){
                System.out.print("*");
            }
            // Star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" ");
            }
            // Space
            for(int j=0; j<n-i-1;j++){
                System.out.print("*");
            }
            // number
            System.out.print(" " + (i+1));
            System.out.println();
        }
            // ----------------------------------------------------------------
            for (int i = 0; i < n; i++) {
            // Space
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            // Star
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print(" ");
            }
            // Space
            int j=0;
            for(; j<i;j++){
                System.out.print("*");
            }
            System.out.print(" " + (n-j));
            System.out.println();
        }

        s.close();
    }
}
