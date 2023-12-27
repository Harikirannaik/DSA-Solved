import java.util.*;

public class FindCharCase {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    char ch = s.next().charAt(0);

    if(ch >= 'A' && ch <= 'Z'){
        System.out.println(ch + " is Uppercase");
    }
    else if(ch >= 'a' && ch <= 'z'){
        System.out.println(ch + " 3is Lowercase");
    }
    else{
        System.out.println("Please enter a Character");
    }
}
}
