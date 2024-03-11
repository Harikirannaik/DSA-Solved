import java.util.Scanner;

public class invtriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
}
