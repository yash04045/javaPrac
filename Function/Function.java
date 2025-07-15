// import java.util.*;
// public class Function {
//     public static int CalculateSum(int num1,int num2){
//         int sum= num1+num2;
//         System.out.println("Sum of two numbers is: "+sum);
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         CalculateSum(a,b);
//         sc.close();
//     }
// }




//product of a number
// import java.util.*;
// public class Function {
//     public static int CalculateProduct(int num1,int num2){
//         int product= num1*num2;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         int product=CalculateProduct(a,b);
//         System.out.println(product);
//         sc.close();
//     }
// }



// import java.util.*;

// public class Function {
//     public static int Factorial(int num1){
//         int f= 1;

//         for(int i=1; i<=num1;i++){
//             f=f*i;
            
//         }
//         return f;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();

//         System.out.println(Factorial(n));
//         sc.close();
//     }
// }



// binomial Coefficient
// import java.util.*;

// public class Function {
//     public static int Factorial(int num1){
//         int f= 1;

//         for(int i=1; i<=num1;i++){
//             f=f*i;
            
//         }
//         return f;
//     }
//     public static int BinCoeff(int num1,int r){
//         int factorial_n= Factorial(num1);
//         int factorial_r= Factorial(r);
//         int factoraial_n_r= Factorial(num1-r);

//         int BinCoeff = factorial_n/ (factorial_r*factoraial_n_r);
//         return BinCoeff;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
        
//         int a= sc.nextInt();
//         int b= sc.nextInt();

//         System.out.println(BinCoeff(a,b));
//         sc.close();
//     }
// }




//Check wherther the function is prime or not using function
// import java.util.*;

// public class Function {
//     public static boolean isPrime(int num){
        
//         for(int i=2; i<=num-1;i++){
//             if (num%i==0) {
//                 return false;
//             }            
//         }
//         return true; 
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.println(isPrime(n));
//         sc.close();
//     }
// }
            



// Print all the Prime number in the range.
import java.util.*;

public class Function {
    public static boolean isPrime(int num){
        
        for(int i=2; i<=num-1;i++){
            if (num%i==0) {
                return false;
            }            
        }
        return true; 
    }
    public static void PrimeRange(int n){
        for(int i=2; i<=n;i++){
            boolean a=isPrime(i);
            if(a==true){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        PrimeRange(n);
        sc.close();
    }
}




// Binary To Decimal 
// import java.util.*;

// public class Function {
//     public static void BinDec(int n){
//         int pow=0;
//         int Decimal=0;

//         while(n>0){
//             int lastDigit= n%10;
//             int power=(lastDigit* (int)Math.pow(2, pow));
//             Decimal= Decimal+power;
//             pow++;
//             n=n/10;
//         }
//         System.out.println("Binary to Decimal conversion of n is: "+Decimal);
        
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();

//         BinDec(n);
//     }
// }



//Decimal to Binary Conversion
// import java.util.*;

// public class Function {
//     public static void DecBin(int n){
//         int pow=0;
//         int bin=0;

//         while(n>0){
//             int rem= n%2;
//             int power=(rem* (int)Math.pow(10, pow));
//             bin= bin+power;
//             pow++;
//             n=n/2;
            
//         }
//         System.out.println("Decimal to Binary conversion of n is: "+bin);
        
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();

//         DecBin(n);
//     }
// }




