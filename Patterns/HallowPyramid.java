
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
            System.out.print("*");
            // space2
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            // space3
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        

        s.close();
    }
}
