import java.util.Scanner;

public class NumDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = s.nextInt();
        // NumtriPyramid
        for(int i=0;i<n;i++){
            // Space
            for(int j=0;j<=n-i-2;j++){
                System.out.print(" ");
            }
            // Number
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            // number 2
            for(int j=0;j<i;j++){
                System.out.print(i-j);
            }
            
            System.out.println();
            // UltanumtriPyramid
        }
        // UltanumtriPyramid
        for (int i = 1; i < n; i++) {
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
