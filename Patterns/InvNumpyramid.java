import java.util.*;
public class InvNumpyramid {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Any Value: ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print(n-(i+j));
            }
            System.out.println();
        }
        s.close();
    }
}
