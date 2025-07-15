import java.util.*;
public class homework2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Year Value: ");
        int Year= sc.nextInt();

        if(Year%4==0){
            if (Year%100==0) {
                if(Year%400==0){
                    System.out.println("Its a Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Bhai Leap Year hai");
            }
        }
        else{
            System.out.println("Bhai Leap Year Nhi h");
        }
        sc.close();
    }
}
