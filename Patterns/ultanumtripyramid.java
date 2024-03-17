import java.util.Scanner;

public class ultanumtripyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j);
            }
            // Number
            for (int j = i+2; j <=n; j++) {
                System.out.print(n-j+1);
            }

            System.out.println();

        }
        s.close();
    }
}
