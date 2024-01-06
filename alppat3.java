import java.util.Scanner;

public class alppat3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = (char)('A'+ n - 1);
        for(int i = 1; i<=n; i++){
          
          for(int j = 0; j<i; j++){
            System.out.print((char)(ch+j));
          }
          System.out.println();
            ch--;
        }
    }
}
