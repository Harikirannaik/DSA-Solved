import java.util.Scanner;

public class whileDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        int i=1;
        // top Spaces
        while (i<=n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print("J");
                j++;
            }
            int k=1;
            while(k<2*n - i){
                System.out.print("k");
                k++;
            }
            System.out.println();
            i++;
        }

        s.close();
    }
}
