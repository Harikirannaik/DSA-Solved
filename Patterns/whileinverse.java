import java.util.Scanner;

public class whileinverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of *: ");
        int n = s.nextInt();
        int i=0;
        while(i<n-1){
            // star
            int j=1;
            while(j<n-i+1){
                System.out.print("*");
                j+=1;
            }
            // space
            j=1;
            while(j<2*i+1){
                System.out.print(" ");
                j+=1;
            }
            //star
            j=1;
            while(j<=n-i-1){
                System.out.print("*");
                j+=1;
            }
            if (n % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("*");
            }

            i+=1;
            System.out.println();
        }
        i=0;
        while(i<n){
            // star
            int j=0;
            while(j<=i){
                System.out.print("*");
                j+=1;
            }
            // space
            j=1;
            while(j< 2 * n - (2 * i + 1)){
                System.out.print(" ");
                j+=1;
            }
            // star
            j=0;
            while(j<i){
                System.out.print("*");
                j+=1;
            }
            if (n % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("*");
            }
            i+=1;
            System.out.println();

        }

        s.close();
    }
}
