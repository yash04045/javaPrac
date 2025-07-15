//Write a Java method to compute the averageof three numbers.
// import java.util.*;
// public class homework4 {
//     public static float Averageof(float num1,float num2,float num3){
//         float avg = (num1 + num2 + num3)/3;
//         System.out.println("The Average of the gicen input is: "+avg);
//         return avg;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int c= sc.nextInt();
//         Averageof(a,b,c);
//     }
    
// }


//Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise.Also write a program to test your method.
// import java.util.*;
// public class homework4 {
//     public static boolean isEven(int num) {
//         if (num%2==0) {
//             return true;
//         }
//         return false;
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(isEven(a));
//     }
// }




//Writea Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not)A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a palindrome because there reverse of 121 is 121 itself.On the other hand , 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
// import java.util.*;
// public class homework4 {
//     public static boolean isPalindrome(int num){
//         int originalnumber=num;
//         int reeversedNumber=0;
//         while(num>0){
//             int rem = num%10;
//             reeversedNumber=reeversedNumber*10+rem;
//             num/=10;
//         }    
//         return originalnumber==reeversedNumber;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(isPalindrome(a));
//     }
// }




//Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:a.Take a variable sum = 0b.Find the last digit of the numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )
import java.util.*;
public class homework4 {
    public static long SumOfDigit(long num1){
        int sum= 0;
        while(num1>0){
            long LastDigit= num1%10;
            sum+=LastDigit;
            num1/=10;
        }
        System.out.println("The Sum of all the digit of the Integer is: "+ sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        SumOfDigit(a);
        sc.close();
    }
}