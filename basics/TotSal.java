package basics;
import java.util.*;
public class TotSal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char grade = s.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        int allow = 0;
        double pf = 0.11 * basic;

        if (grade == 'A'){
            allow = 1700;
        }
        else if (grade == 'B') {
            allow = 1500;
        }
        else{
            allow = 1300;
        }

        double totsal = basic + hra + da + allow - pf ;
        int roundtotsal = (int) Math.round(totsal);
        System.out.println(roundtotsal);

    }
}
