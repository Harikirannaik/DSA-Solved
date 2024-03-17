
import java.util.Scanner;

public class hallowDiamond {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        for (int i = 0; i < n-1; i++) {
            // Star
            for (int j = 1; j < n - i + 1 ; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            // Star
            for(int j=0; j<n-i-1;j++){
                System.out.print("*");
            }
            if(n%2 == 0){
                System.out.print("*");
            }else{
                System.out.print("*");
            }
            System.out.println();
        }
        // ----------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            // Star
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j < 2 * n - (2 * i + 1); j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if(n%2 == 0){
                System.out.print("*");
            }else{
                
            }

            System.out.println();
        }

        s.close();
    }
}
