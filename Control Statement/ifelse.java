// import java.util.*;
// public class ifelse {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();

//         if(a>b){
//             System.out.println("a is greater");
//         }
//         else{
//             System.out.println("b is greater");
//         }

//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//          if(a%2==0){
//             System.out.println("a is even");
//         }
//         else{
//             System.out.println("a is odd");
//         }

//     }
// }


// import java.util.*;

// public class ifelse {

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int Salary= sc.nextInt();

//         if(Salary<500000){
//             System.out.println("U are lucky poor No Taxes");
//         }
//         else if(Salary>500000 && Salary<1000000){
//             double tax= Salary * 0.2;
//             System.out.println("U have to pay tax of at a rate of 20% "+tax);
//         }
//         else{
//             double tax= Salary * 0.3;
//             System.out.println("U have to pay tax of at a rate of 30% "+tax);
//         }
//     }
        
// }

// import java.util.*;

// public class ifelse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your First Number: ");
//         int a= sc.nextInt();
//         System.out.print("Enter your Second Number: ");
//         int b= sc.nextInt();
//         System.out.print("Enter your Third Number: ");
//         int c= sc.nextInt();

//         if (a>b && a>c) {
//             System.out.println("A is Greater");
            
//         }
//         else if(b>a && b>c){
//             System.out.println("B is greater");
//         }
//         else{
//             System.out.println("C is Greater");
//         }
//     }
// }


import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        String b= (a>33) ? "Pass":"Fail";
        System.out.println(b);
        sc.close();
    }
}

