//Write a program that read a set of integers,and then prints the sum of the even and odd integers.

// import java.util.*;
// public class Howework3 {
//     public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
    
//         int evensum=0;
//         int oddsum=0;

//         while(true){    
//             System.out.print("Enter the Integers(type -1 to exit): ");
//             int n= sc.nextInt();
//             if (n==-1) {
//                 System.out.println("You have exited the Process".toUpperCase());
//                 break;
//             }

//             if (n%2==0) {
//                 evensum+=n;
//             }
//             else{
//                 oddsum+=n;
//             }
//         }
//         System.out.println("The SUm of Even Number is: "+evensum);
//         System.out.println("The Sum of Odd Number is:"+oddsum);;

//     }
// }




// import java.util.*;
// public class Howework3 {
//     public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the Value: ");
//        int n=sc.nextInt();

//        int result=1;
//        for (int i = 1; i <=n; i++){
        
//             System.out.println(result*=i );
//         }     
    
//     }
// }



//Write a program to print the multiplication table of a number N,entered by the user.
import java.util.*;
public class howework3 {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number whose multiplication is needed to you: ");
       int n=sc.nextInt();
       for(int i=1; i<=10;i++){
        System.out.println(n+" X "+i+" = "+n*i);
       }
    }
}