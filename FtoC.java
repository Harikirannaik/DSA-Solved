import java.util.*;

public class FtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int f = input.nextInt();
        int c = (int) ((5.0 / 9) * (f - 32));
        System.out.println("Fahrenheit " + f + " is " + c + " in celcius");
    }
}