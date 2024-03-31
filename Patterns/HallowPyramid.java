
import java.util.*;

public class HallowPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any Value: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            if(i>=1){
                System.out.print("*");
            }
            // space2
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // space3
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            if(i>2){
                System.out.print("*");
            }else{
                System.out.print("*");
            }
            System.out.println();
        }
        
        // bottom part
        for (int i = 1; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if(i<n-1){
                System.out.print("*");
            }
            // space2
            for (int j = 1; j < 2 * n - (2 * i + 2); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        s.close();
    }
}
