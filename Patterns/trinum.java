import java.util.*;

public class trinum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        s.close();
    }
}
