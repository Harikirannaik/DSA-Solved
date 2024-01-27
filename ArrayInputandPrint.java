import java.util.Scanner;

public class ArrayInputandPrint {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element at "+ i + "th index: ");
            arr[i]= s.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(i+"th element is: " + arr[i]);
        }
    }
}
