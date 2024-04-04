import java.util.Scanner;

public class whileNumDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = s.nextInt();
        int i=0;
        while(i<n){
            // Space
            int j=0;
            while(j<=n-i-2){
                System.out.print(" ");
                j+=1;
            }
            // Number
            j=1;
            while (j<=i+1) {
                System.out.print(j);
                j+=1;
            }
            // number 2
            j=0;
            while(j<i){
                System.out.print(i-j);
                j+=1;
            }
            i+=1;
            System.out.println();
        }
        // UltanumtriPyramid
        i=1;
        while (i<n) {
            // Space
            int j=1;
            while (j<=1) {
                System.out.print(" ");
                j+=1;
            }
            // Number
            j=1;
            while (j <=n-i) {
                System.out.print(j);
                j+=1;
            }
            // Number 2
            j=i+2;
            while (j <=n) {
                System.out.print(n-j+1);
                j+=1;
            }

            i+=1;
            System.out.println();
        }

        
    s.close();
    }
}
