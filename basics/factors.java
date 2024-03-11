package basics;
import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("factors are");
        for(int i=2; i<=n; i++){  
         if(n % i == 0){
            System.out.println(i + " ");
            }
        }
    }
}
