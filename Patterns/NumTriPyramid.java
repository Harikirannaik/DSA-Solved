import java.util.*;
public class NumTriPyramid {

    // extra space
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            // Space
            for(int j=0;j<=n-i;j++){
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
            
        }
        s.close();

    }
}
