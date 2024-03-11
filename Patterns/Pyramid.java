import java.util.*;

public class Pyramid {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the No of *: ");
    int totalLines = s.nextInt();

    for(int lineNumber = 1; lineNumber<= totalLines; lineNumber+=1){
        int star=totalLines-lineNumber;
        for(;star>=0;star-=1)
            System.err.print("*");
        star=totalLines-lineNumber+1;
        for(;star<totalLines;star+=1)
        System.err.print(" ");
        System.out.println(totalLines-lineNumber+1);

            
    }
    s.close();
}

}
