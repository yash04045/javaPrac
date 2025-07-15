import java.util.*;

// public class homework {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();        
//         int b= sc.nextInt();
//         int c= sc.nextInt();

//         int d= (a+b+c)/3;

//         System.out.println("The Average of 3 Number is : "+ d);


//     }
    
// }

    public class homework {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter the Amount of Pencil : ");
            float pencil= sc.nextFloat();
            System.out.println("Enter the Amount of Eraser : ");
            float eraser= sc.nextFloat();
            System.out.println("Enter the Amount of Pen : ");
            float pen= sc.nextFloat();
        

            float TotalBeforeGST= pencil+pen+eraser;
            System.out.println("The Total Amount is : "+ TotalBeforeGST);
            System.out.println("GST applicabel is 18% ");
            float GST = TotalBeforeGST*0.18f;
            float TotalBill= TotalBeforeGST + GST;
            System.out.println("The Total Bill is : "+ TotalBill);
        }
            
    }


