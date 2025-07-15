
import java.util.*;
public class InputOutputUpdate {
    public static void main(String[] args) {
        int marks[]= new int[50];
        Scanner sc= new Scanner(System.in);

        marks[0]= sc.nextInt();   //inputOutput operation  
        marks[1]= sc.nextInt();   //inputOutput operation  
        marks[2]= sc.nextInt();   //inputOutput operation

        System.out.println("phy: "+ marks[0]);    
        System.out.println("chem:  "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        marks[1]=60;
        System.out.println("chem:  "+ marks[1]); //updation and also can perform mathematical operation.
         //To find the length of array we can use ".length" function.
    }
    
}
