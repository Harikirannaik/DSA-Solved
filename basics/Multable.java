package basics;
import java.util.Scanner;

public class Multable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n +" table is: ");
        for(int i = 1; i<= 10; i++){
            System.out.println(n +"X" + i +"=" + n*i);
        }
    }
}
