import java.util.*;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Any Value : ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<i+2; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
