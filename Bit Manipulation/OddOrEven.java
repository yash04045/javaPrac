
import java.util.Scanner;



public class OddOrEven {
    public static void oddOrEven(int n){
        int BitMask = 1; // 0001 in binary
        if((n & BitMask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        oddOrEven(n);
    }
}
