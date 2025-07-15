import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter The Valur of Radius (r): ");
        int r = sc.nextInt();
        float pi = 3.14f; 
        System.out.println("As we already the Value of pi is "+ pi);
        
        float  AreaOfCircle =pi*r*r;

        System.out.println("Area of the circle for the given condition is : "+ AreaOfCircle);
        
        System.out.println("");
    }
}
