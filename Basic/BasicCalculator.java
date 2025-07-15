import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter operation to be performed: ");
        String c= sc.next();

        switch(c){
            case "Addition || addition": System.out.println(a+b);
                            break;
            case "Subtraction": System.out.println(a-b);
                            break;
            case "Division": System.out.println(a/b);
                            break;
            case "Multiplication": System.out.println();
                            break;
            case "Modulo": System.out.println(a%b);
                            break;
            default: System.out.println("Wrong Input");

        }


    }
}
